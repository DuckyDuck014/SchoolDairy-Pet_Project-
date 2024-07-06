package com.example.spring.app.springapp.employeers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.app.springapp.employeers.entity.Employeers;
import com.example.spring.app.springapp.employeers.repository.employeersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class defaultEmployeersService implements employeersService{
    
    private final employeersRepository employeersRepository;

    @Override
    public List<Employeers> findAllemployeers() {
       return this.employeersRepository.findAll();
    }

    @Override
    public Employeers createNewEmployeer(String firstName, String secondName, Double salary, Integer age) {
       return this.employeersRepository.save(new Employeers(null,firstName,secondName,salary,age));
    }

}
