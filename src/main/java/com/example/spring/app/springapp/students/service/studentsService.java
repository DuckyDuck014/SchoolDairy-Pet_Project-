package com.example.spring.app.springapp.students.service;

import java.util.List;


import com.example.spring.app.springapp.students.entity.Students;

public interface studentsService {

    List<Students> findAllStudents();
    
}