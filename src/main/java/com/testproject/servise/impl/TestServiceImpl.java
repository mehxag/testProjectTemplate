package com.testproject.servise.impl;

import com.testproject.entity.TestEntity;
import com.testproject.repository.TestRepository;
import com.testproject.servise.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository repository;

    public TestServiceImpl(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TestEntity> getAllId() {
        return repository.getAllId();
    }
}
