package com.example.demo.service.impl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
private final UserRepository repo;
private final PasswordEncoder encoder;
public UserServiceImpl(UserRepository repo, PasswordEncoder encoder) {
this.repo = repo;
this.encoder = encoder;
}
public User register(User user) {
if (repo.existsByEmail(user.getEmail())) {
throw new RuntimeException("Email already exists");
}
user.setPassword(encoder.encode(user.getPassword()));
return repo.save(user);
}
public User findByEmail(String email) {
return repo.findByEmailIgnoreCase(email)
.orElseThrow(()-> new ResourceNotFoundException("User not 
found"));
}
}