package com.java.cube.controllers;

import com.java.cube.domain.ListAccidentTypeEntity;
import com.java.cube.services.ListAccidentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ListAccidentControllers {
    private final ListAccidentService listAccidentService;

    public ListAccidentControllers(ListAccidentService listAccidentService) {
        this.listAccidentService = listAccidentService;
    }

    @GetMapping
    public String getBooks(Model model) {
        model.addAttribute("books", listAccidentService.findAll());
        return "bookList";
    }

    @GetMapping("/create")
    public String createBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "createBook";
    }

    @PostMapping("/create")
    public String createBook(@Validated Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "createBook";
        }
        bookService.save(book);
        return "redirect:/books";
    }


    @GetMapping("/edit/{id}")
    public String editBookForm(@PathVariable("id") Long id, Model model) {
        Book bookFound = bookService.findById(id);

        if (bookFound != null) {
            model.addAttribute("book", bookFound);
            return "editBook";
        } else {
            return "redirect:/books";
        }
    }

    @PostMapping("/edit/{id}")
    public String editBook(@PathVariable("id") Long id, @Validated Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook";
        }
        book.setId(id);
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }
}