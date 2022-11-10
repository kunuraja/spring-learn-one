package com.raj.springlearnone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import raj.component.scan.MyService;

@Controller
public class MyController {

    @Autowired
    // Here if we will not add Qualifier then spring will throw error as it doesn't know demoController()
    // of which serviceImpl needs to be called
    @Qualifier("myServiceOneImpl")
    private MyService myService;

    public String demoController() {
        return myService.getMyService();
    }
}
