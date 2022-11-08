package com.raj.springlearnone.controller;

import com.raj.springlearnone.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    // Here if we will not add Qualifier then spring will throw error as it doesn't know demoController()
    // of which serviceImpl needs to be called
    @Qualifier("myServiceOneImpl")
    private MyService myService;

    public String demoController(){
        return myService.getMyService();
    }
}
