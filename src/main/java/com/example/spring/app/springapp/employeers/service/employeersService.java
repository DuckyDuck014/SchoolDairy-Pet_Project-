package com.example.spring.app.springapp.employeers.service;

import java.util.List;

import com.example.spring.app.springapp.employeers.entity.Employeers;

public interface employeersService  {

    List<Employeers> findAllemployeers();

    Employeers createNewEmployeer(String firstName,String secondName,Double salary,Integer age);


}
