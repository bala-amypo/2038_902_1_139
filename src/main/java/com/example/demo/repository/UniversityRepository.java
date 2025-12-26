package com.example.demo.repository;

import com.example.demo.entity.University;
import java.util.Optional;

public interface UniversityRepository {
    Optional<University> findById(Long id);
    Optional<University> findByName(String name);
    boolean existsById(Long id);
    University save(University u);
}
