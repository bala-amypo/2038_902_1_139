package com.example.demo.service.impl;

import com.example.demo.entity.University;
import com.example.demo.repository.UniversityRepository;

public class UniversityServiceImpl {

    UniversityRepository repository;

    public University createUniversity(University u) {
        if (u == null || u.getName() == null)
            throw new IllegalArgumentException("Name required");

        if (repository.findByName(u.getName()).isPresent())
            throw new IllegalArgumentException("exists");

        return repository.save(u);
    }

    public University updateUniversity(Long id, University u) {
        University ex = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        ex.setName(u.getName());
        return repository.save(ex);
    }

    public University getUniversityById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public void deactivateUniversity(Long id) {
        University u = getUniversityById(id);
        u.setActive(false);
        repository.save(u);
    }
}
