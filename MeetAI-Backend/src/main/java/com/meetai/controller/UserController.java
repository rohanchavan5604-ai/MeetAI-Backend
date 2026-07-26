package com.meetai.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.meetai.entity.User;
import com.meetai.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Home API
    @GetMapping("/")
    public String home() {
        return "Welcome to MeetAI Backend";
    }

    // Save User
    @PostMapping("/api/v1/users")
    public ResponseEntity<User> saveUser(@RequestBody User user) {

        User savedUser = userService.saveUser(user);

        return ResponseEntity.ok(savedUser);
    }

    // Get All Users
    @GetMapping("/api/v1/users")
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }
}