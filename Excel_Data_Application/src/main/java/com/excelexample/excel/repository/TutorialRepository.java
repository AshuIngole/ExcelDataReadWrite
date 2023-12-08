package com.excelexample.excel.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.excelexample.excel.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}