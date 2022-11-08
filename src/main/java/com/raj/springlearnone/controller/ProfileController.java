package com.raj.springlearnone.controller;

import com.raj.springlearnone.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {

    @Autowired
    @Qualifier("springProfile") // Suppose both the impl services having the same service name set. So
    // at this point qualifier will not be able to identify, which bean to select. In that case we can
    // set profile for each bean
    private MyService myService;

    public String demoProfileController(){
        return myService.getMyService();
    }
}
