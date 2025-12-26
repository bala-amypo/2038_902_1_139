package com.example.demo.repository;

import com.example.demo.entity.CourseContentTopic;
import java.util.*;

public interface CourseContentTopicRepository {
    Optional<CourseContentTopic> findById(Long id);
    List<CourseContentTopic> findByCourseId(Long courseId);
    CourseContentTopic save(CourseContentTopic topic);
}
