package com.example.spring.app.springapp.employeers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.app.springapp.employeers.controller.payload.NewEmployeerPayload;
import com.example.spring.app.springapp.employeers.entity.Employeers;
import com.example.spring.app.springapp.employeers.service.employeersService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;





@Controller 
@RequiredArgsConstructor
@RequestMapping("/catalogue/employeers")
public class employeersController{

    private final employeersService employeersService;

@GetMapping("list")
public String getEmployeersList(Model model) {
    model.addAttribute("employeers", this.employeersService.findAllemployeers());
    return "/catalogue/employeers/list";
}
@GetMapping("create")
public String getNewEmployeePage(){
     return "/catalogue/employeers/new_employeer";
}
@PostMapping("create")
public String createNewEmployeer(NewEmployeerPayload payload){
   Employeers employeer = this.employeersService.createNewEmployeer(payload.firstName(), payload.secondName(), payload.salary(), payload.age());
   return"redirect:/catalogue/employeers/list";
}
    
}
