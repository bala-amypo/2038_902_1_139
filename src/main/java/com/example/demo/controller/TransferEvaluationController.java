package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.*;
@RestController
@RequestMapping("/api/transfers")
public class TransferEvaluationController {
@PostMapping("/evaluate")
public TransferEvaluationResponse evaluate(@RequestBody
TransferEvaluationRequest req) {
TransferEvaluationResponse res = new TransferEvaluationResponse();
res.totalTransferableCredits = 20.0;
res.status = "APPROVED";
res.remarks = "Eligible";
return res;
}
}