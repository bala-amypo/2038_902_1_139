package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;

import java.util.List;

public class CourseServiceImpl {

    CourseRepository repo;
    UniversityRepository univRepo;

    public Course createCourse(Course c) {
        if (c.getCreditHours() <= 0)
            throw new IllegalArgumentException("> 0");

        Long uid = c.getUniversity().getId();
        univRepo.findById(uid).orElseThrow(() -> new RuntimeException("not found"));

        if (repo.findByUniversityIdAndCourseCode(uid, c.getCourseCode()).isPresent())
            throw new IllegalArgumentException("duplicate");

        return repo.save(c);
    }

    public Course updateCourse(Long id, Course c) {
        Course ex = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        return repo.save(ex);
    }

    public Course getCourseById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public void deactivateCourse(Long id) {
        Course c = getCourseById(id);
        c.setActive(false);
        repo.save(c);
    }

    public List<Course> getCoursesByUniversity(Long id) {
        return repo.findByUniversityIdAndActiveTrue(id);
    }
}
