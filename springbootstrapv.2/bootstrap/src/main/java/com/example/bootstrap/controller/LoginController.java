package com.example.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginPage(){
        return "page_login";
    }

    @RequestMapping("/home")
    public String loginSubmit(){
        return "/pages/page_home";
    }
}
