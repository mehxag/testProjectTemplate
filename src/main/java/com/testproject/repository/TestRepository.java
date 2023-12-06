package com.testproject.repository;

import com.testproject.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {

    @Query("select test from TestEntity test")
    List<TestEntity> getAllId();
}
