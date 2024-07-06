package com.example.spring.app.springapp.employeers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employeers {

    private Integer id;

    private String firstName;

    private String secondName;

    private Double salary;
     
    private Integer age;

}