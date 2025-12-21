package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transfer_requests")
public class TransferRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sourceProgramId;
    private Long targetProgramId;
    private String studentId;

    public Long getId() {
        return id;
    }

    public Long getSourceProgramId() {
        return sourceProgramId;
    }

    public void setSourceProgramId(Long sourceProgramId) {
        this.sourceProgramId = sourceProgramId;
    }

    public Long getTargetProgramId() {
        return targetProgramId;
    }

    public void setTargetProgramId(Long targetProgramId) {
        this.targetProgramId = targetProgramId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
