package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
public class TransferEvaluationController {

    @PostMapping("/evaluate")
    public Map<String, Object> evaluate(@RequestBody Map<String, Object> request) {

        double amount = Double.parseDouble(request.get("amount").toString());

        Map<String, Object> response = new HashMap<>();

        if (amount <= 10000) {
            response.put("eligible", true);
            response.put("message", "Transfer Approved");
        } else {
            response.put("eligible", false);
            response.put("message", "Transfer Amount Too High");
        }

        return response;
    }
}
