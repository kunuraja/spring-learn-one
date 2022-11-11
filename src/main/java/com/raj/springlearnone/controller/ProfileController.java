package com.raj.springlearnone.controller;

import com.raj.springlearnone.service.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {

    private MyService myService;

    public ProfileController(@Qualifier("profileService") MyService myService) {
        this.myService = myService;
    }


    public String profileDemoJavaConfig(){
        return myService.getMyService();
    }
}
