package com.raj.springlearnone.controller;

import com.raj.springlearnone.service.MyService;
import com.raj.springlearnone.service.PrimaryBeanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    @Autowired
    private MyService myService;


    public String primaryBeanController() {
        return myService.getMyService();
    }

}
