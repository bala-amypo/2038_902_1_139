package com.example.demo.repository;

import com.example.demo.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProgramRepository extends JpaRepository<Program, Long> {

    List<Program> findByUniversityId(Long universityId);

    Optional<Program> findByUniversityIdAndNameIgnoreCase(Long universityId, String name);
}
