package com.example.demo.repository;

import com.example.demo.entity.TransferRule;
import java.util.*;

public interface TransferRuleRepository {
    Optional<TransferRule> findById(Long id);
    List<TransferRule> findBySourceUniversityIdAndTargetUniversityIdAndActiveTrue(Long sourceId, Long targetId);
    TransferRule save(TransferRule rule);
}
