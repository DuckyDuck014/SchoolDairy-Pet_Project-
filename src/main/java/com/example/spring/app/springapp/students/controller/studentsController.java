package com.example.spring.app.springapp.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.app.springapp.students.service.studentsService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/catalogue/students")
public class studentsController {

    private final studentsService studentsService;


@RequestMapping("list")
    public String getStudentsList(Model model){
        model.addAttribute("students", this.studentsService.findAllStudents());
        return"/catalogue/students/list";
        
    }


    

}
