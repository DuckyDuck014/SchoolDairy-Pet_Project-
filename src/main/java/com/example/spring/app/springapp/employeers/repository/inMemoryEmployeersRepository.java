package com.example.spring.app.springapp.employeers.repository;

import com.example.spring.app.springapp.employeers.entity.Employeers;

import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import org.springframework.stereotype.Repository;


@Repository
public class inMemoryEmployeersRepository implements employeersRepository {

    private final List<Employeers> employeers = Collections.synchronizedList(new LinkedList<>());


     

    @Override
    public List<Employeers> findAll() {

        return Collections.unmodifiableList(this.employeers);
    }



    @Override
    public Employeers save(Employeers employeer) {
        employeer.setId(this.employeers.stream()
        .max(Comparator.comparingInt(Employeers::getId))
        .map(Employeers::getId).orElse(0)+1);
        this.employeers.add(employeer);
        return employeer;

    }
}


