package com.domineospring.spring_session.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

/**
 * Created by nando on 17/04/17.
 */
@Controller
public class SecuredController {


    @GetMapping("/")
    public ModelAndView home(Principal principal){
        ModelAndView modelAndView = new ModelAndView("secured-page");

        modelAndView.addObject("username", principal.getName());

        return modelAndView;
    }
}
