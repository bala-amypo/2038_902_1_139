package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "courses")
2
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(unique = true)
private String code;
private String title;
private Double credits;
}