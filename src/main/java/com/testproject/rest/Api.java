package com.testproject.rest;

import com.testproject.entity.TestEntity;
import com.testproject.servise.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Api {

    private final TestService service;

    @GetMapping("/api")
    public List<TestEntity> getInfo() {
        return service.getAllId();
    }
}
