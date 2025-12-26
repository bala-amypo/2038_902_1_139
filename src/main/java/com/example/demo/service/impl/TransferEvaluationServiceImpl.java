package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;

import java.util.List;

public class TransferEvaluationServiceImpl {

    CourseRepository courseRepo;
    CourseContentTopicRepository topicRepo;
    TransferRuleRepository ruleRepo;
    TransferEvaluationResultRepository resultRepo;

    public TransferEvaluationResult evaluateTransfer(Long srcId, Long tgtId) {

        Course src = courseRepo.findById(srcId)
                .orElseThrow(() -> new RuntimeException("not found"));
        Course tgt = courseRepo.findById(tgtId)
                .orElseThrow(() -> new RuntimeException("not found"));

        if (!src.isActive() || !tgt.isActive())
            throw new IllegalArgumentException("active");

        List<CourseContentTopic> st = topicRepo.findByCourseId(srcId);
        List<CourseContentTopic> tt = topicRepo.findByCourseId(tgtId);

        double overlap = 0;
        for (CourseContentTopic s : st) {
            for (CourseContentTopic t : tt) {
                if (s.getTopicName().equalsIgnoreCase(t.getTopicName())) {
                    overlap += Math.min(s.getWeightPercentage(), t.getWeightPercentage());
                }
            }
        }

        TransferEvaluationResult r = new TransferEvaluationResult();
        r.setOverlapPercentage(overlap);
        r.setIsEligibleForTransfer(false);
        r.setNotes("No active transfer rule");

        resultRepo.save(r);
        return r;
    }

    public TransferEvaluationResult getEvaluationById(Long id) {
        return resultRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<TransferEvaluationResult> getEvaluationsForCourse(Long id) {
        return resultRepo.findBySourceCourseId(id);
    }
}
