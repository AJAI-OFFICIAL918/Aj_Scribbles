package com.example.demo.controller;

import com.example.demo.model.Students;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    private List<Students> li= new ArrayList<>(List.of(
            new Students(1,"Ajai",20),
            new Students(2,"dean",99)
    ));

    @GetMapping("/students")
    public List<Students> getStudents(){
        return li;
    }


    @GetMapping("/csrf-get")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public Students getStud(@RequestBody Students student){
        li.add(student);
        return student;
    }

}
