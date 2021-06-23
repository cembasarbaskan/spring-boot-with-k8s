package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("test");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Test>> getAll() {
        return ResponseEntity.ok(testService.findAll());
    }

    @PostMapping("/{value}")
    public ResponseEntity<Test> post(@PathVariable String value) {
        return ResponseEntity.ok(testService.save(value));
    }
}
