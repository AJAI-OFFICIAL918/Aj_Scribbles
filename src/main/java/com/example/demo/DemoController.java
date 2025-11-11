package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController

public class DemoController {

      @GetMapping("/")
      public  String hi(HttpServletRequest request ){
          return "Hi Ajai "+request.getSession().getId();
      }
//    @GetMapping ("/logout")
//    public void logout(){
//        System.out.println("Logged Out");
//    }
}
