package com.example.spring.app.springapp.students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.app.springapp.students.entity.Students;
import com.example.spring.app.springapp.students.repository.studentsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class defaultStudentService implements studentsService{

    private final studentsRepository studentsRepository;

    public List<Students> findAllStudents() {
        return this.studentsRepository.findAll();


    }

}
