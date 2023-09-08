package com.java.cube.services;

import com.java.cube.domain.ListAccidentTypeEntity;
import com.java.cube.repositories.ListAccidentRepository;
import org.springframework.stereotype.Service;

@Service
public class ListAccidentTypeServiceImpl implements ListAccidentService{
    private final ListAccidentRepository listAccidentRepository;

    public BookServiceImpl(ListAccidentRepository listAccidentRepository) {
        this.listAccidentRepository = listAccidentRepository;
    }

    @Override
    public List<ListAccidentTypeEntity> findAll() {
        return (List<ListAccidentTypeEntity>) listAccidentRepository.findAll();
    }

    @Override
    public ListAccidentTypeEntity findById(Long id) {
        return listAccidentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ListAccidentTypeEntity listAccidentTypeEntity) {
        listAccidentRepository.save(listAccidentTypeEntity);
    }

    @Override
    public void deleteById(Long id) {
        listAccidentRepository.deleteById(id);
    }
}
