package com.example.demo.repository;

import com.example.demo.entity.TransferEvaluationResult;
import java.util.*;

public interface TransferEvaluationResultRepository {
    Optional<TransferEvaluationResult> findById(Long id);
    List<TransferEvaluationResult> findBySourceCourseId(Long courseId);
    TransferEvaluationResult save(TransferEvaluationResult result);
}
