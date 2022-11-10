package com.raj.springlearnone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import raj.component.scan.MyService;

@Controller
public class PrimaryController {

    @Autowired
    private MyService myService;


    public String primaryBeanController() {
        return myService.getMyService();
    }

}
