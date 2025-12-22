package com.example.demo.controller;

import com.example.demo.dto.TransferEvaluationRequest;
import com.example.demo.dto.TransferEvaluationResponse;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
public class TransferEvaluationController {

    @PostMapping("/evaluate")
    public TransferEvaluationResponse evaluate(
            @RequestBody TransferEvaluationRequest request) {

        return new TransferEvaluationResponse();
    }
}
