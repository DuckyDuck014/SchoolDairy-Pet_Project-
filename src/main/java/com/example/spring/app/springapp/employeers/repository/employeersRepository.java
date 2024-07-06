package com.example.spring.app.springapp.employeers.repository;

import java.util.List;

import com.example.spring.app.springapp.employeers.entity.Employeers;

public interface employeersRepository {

    List<Employeers> findAll();

    Employeers save(Employeers employeer);

    
}
