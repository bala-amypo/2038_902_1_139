package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "course_mappings")
public class CourseMapping {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@ManyToOne
private Course sourceCourse;
@ManyToOne
private Course targetCourse;
private String equivalencyType;
private String minGradeRequired;
}