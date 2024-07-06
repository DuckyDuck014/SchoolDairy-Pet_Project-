package com.example.spring.app.springapp.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.app.springapp.employeers.controller.payload.NewEmployeerPayload;
import com.example.spring.app.springapp.employeers.entity.Employeers;
import com.example.spring.app.springapp.students.controller.payload.NewStudentPayload;
import com.example.spring.app.springapp.students.entity.Students;
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
@GetMapping("create")
public String getNewStudentPage(){
     return "/catalogue/employeers/new_employeer";
}
@PostMapping("create")
public String createNewStudent(NewStudentPayload payload){
   Students students = this.studentsService.createNewStudent(payload.firstName(), payload.secondName(), payload.classNumber(), payload.classChar());
   return"redirect:/catalogue/employeers/list";
}

    

}
