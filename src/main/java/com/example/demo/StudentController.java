package com.example.demo;

import com.example.demo.StudentRepo.Students;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    @PostMapping("/students")
    public Students getStud(@RequestBody Students student){
        li.add(student);
        return student;
    }

}
