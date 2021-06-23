package com.example.demo.service;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestService {
    private final TestDAO testDAO;

    public Test save(String value) {
        return testDAO.save(new Test(value));
    }

    public List<Test> findAll() {
        return testDAO.findAll();
    }
}

