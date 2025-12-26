package com.example.demo.repository;

import com.example.demo.entity.Course;
import java.util.*;

public interface CourseRepository {
    Optional<Course> findById(Long id);
    Optional<Course> findByUniversityIdAndCourseCode(Long universityId, String courseCode);
    List<Course> findByUniversityIdAndActiveTrue(Long universityId);
    Course save(Course course);
}
