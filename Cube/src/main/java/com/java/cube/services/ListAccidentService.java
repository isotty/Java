package com.java.cube.services;

import com.java.cube.domain.ListAccidentTypeEntity;
import java.util.List;
public interface ListAccidentService {
    List<ListAccidentTypeEntity> findAll();
    ListAccidentTypeEntity findById(Long id);
    void save(ListAccidentTypeEntity ListAccidentTypeEntity);
    void deleteById(Long id);
}
