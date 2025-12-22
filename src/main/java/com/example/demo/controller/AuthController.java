package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> request) {

        String username = request.get("username");
        String password = request.get("password");

        Map<String, Object> response = new HashMap<>();
        response.put("username", username);
        response.put("status", "LOGIN_SUCCESS");

        return response;
    }
}
