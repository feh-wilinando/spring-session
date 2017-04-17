package com.domineospring.spring_session.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by nando on 17/04/17.
 */
@Controller
public class LoginController {


    @GetMapping("/login")
    public String formLogin(){
        return "login";
    }
}
