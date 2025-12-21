package com.example.demo.dto;

import java.util.List;

public class TransferEvaluationRequest {

    private Long sourceProgramId;
    private Long targetProgramId;
    private List<String> completedCourseCodes;

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

    public List<String> getCompletedCourseCodes() {
        return completedCourseCodes;
    }

    public void setCompletedCourseCodes(List<String> completedCourseCodes) {
        this.completedCourseCodes = completedCourseCodes;
    }
}
