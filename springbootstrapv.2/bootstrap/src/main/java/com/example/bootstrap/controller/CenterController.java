package com.example.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {

    @RequestMapping("/centered")
    public String centeredPage(){
        return "/pages/page_list_user";
    }
}
