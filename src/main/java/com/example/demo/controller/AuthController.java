package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.*;
@RestController
@RequestMapping("/auth")
public class AuthController {
@PostMapping("/login")
public AuthResponse login(@RequestBody AuthRequest request) {
AuthResponse res = new AuthResponse();
res.email = request.email;
res.role = "STUDENT";
res.token = "dummy-jwt-token";
return res;
}
}