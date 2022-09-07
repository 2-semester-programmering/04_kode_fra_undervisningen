package com.example.my_first_website.controller;


import com.example.my_first_website.service.Calculate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private Calculate s = new Calculate();


    @GetMapping("/")
    public String index(){
        return "Hello  Dat22v1";
    }

    @GetMapping("/view")
    public String message(@RequestParam String v){
        String res = s.isItFriday();
        return "Now i am showing video with id  " + v;
    }



}
