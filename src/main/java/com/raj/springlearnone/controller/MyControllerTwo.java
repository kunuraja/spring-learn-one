package com.raj.springlearnone.controller;

import com.raj.springlearnone.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerTwo {
    @Autowired
    private MyService myService;

    public String demoControllerTwo(){
        return myService.getMyService();
    }

}
