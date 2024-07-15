package com.portfolio_tracker.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("/open")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Public...");
    }

    @GetMapping("/close")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("Private...");
    }
    @GetMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("Logged out...");
    }
}
