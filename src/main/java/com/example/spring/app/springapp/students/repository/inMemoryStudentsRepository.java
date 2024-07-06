package com.example.spring.app.springapp.students.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.spring.app.springapp.students.entity.Students;

@Repository
public class inMemoryStudentsRepository implements studentsRepository {

    private final List<Students> students = Collections.synchronizedList(new LinkedList<>());

    @Override
    public List<Students> findAll() {
        return Collections.unmodifiableList(this.students);

    }

}
