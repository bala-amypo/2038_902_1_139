package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "programs")
public class Program {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@ManyToOne
private University university;
private String name;
private String level;
}