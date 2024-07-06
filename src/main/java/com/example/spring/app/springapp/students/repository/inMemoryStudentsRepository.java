package com.example.spring.app.springapp.students.repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.spring.app.springapp.employeers.entity.Employeers;
import com.example.spring.app.springapp.students.entity.Students;

@Repository
public class inMemoryStudentsRepository implements studentsRepository {

    private final List<Students> students = Collections.synchronizedList(new LinkedList<>());

    @Override
    public List<Students> findAll() {
        return Collections.unmodifiableList(this.students);

    }

    @Override
    public Students save(Students students) {
        students.setId(this.students.stream()
            .max(Comparator.comparingInt(Students::getId))
            .map(Students::getId).orElse(0)+1);
            this.students.add(students);
            return students;
    }

}
