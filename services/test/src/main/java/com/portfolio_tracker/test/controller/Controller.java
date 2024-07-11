package com.portfolio_tracker.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class Controller {

    @GetMapping("/public")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Public...");
    }

    @GetMapping("/private")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("Private...");
    }
}
