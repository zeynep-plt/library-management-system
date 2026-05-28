package com.example.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/admin")
    public String adminAccess() {
        return "Welcome Admin!";
    }

    @GetMapping("/user")
    public String userAccess() {
        return "Welcome User!";
    }
}
