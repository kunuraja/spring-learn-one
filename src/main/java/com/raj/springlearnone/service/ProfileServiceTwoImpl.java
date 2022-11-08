package com.raj.springlearnone.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"S2","default"}) -- When default profile is set, then by default this bean will be selected
@Profile("S2") // This is teh active profile. For this we need to set active profile in application.properties
@Service ("springProfile")
public class ProfileServiceTwoImpl implements MyService{
    @Override
    public String getMyService() {
        return "Profile service - ProfileServiceTwoImpl";
    }
}
