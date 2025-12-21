package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "transfer_requests")
public class TransferRequest {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
3
private Long id;
private String studentId;
@ManyToOne
private Program sourceProgram;
@ManyToOne
private Program targetProgram;
private String status;
}