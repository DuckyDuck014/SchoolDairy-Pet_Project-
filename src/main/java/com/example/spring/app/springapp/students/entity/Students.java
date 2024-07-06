package com.example.spring.app.springapp.students.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {

    private Integer id;

    private String firstName;

    private String secondName;

    private Double classNumber;

    private String classChar;
    
}
