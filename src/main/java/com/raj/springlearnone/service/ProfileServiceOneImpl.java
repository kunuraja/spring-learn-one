package com.raj.springlearnone.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"S1", "default"})
@Service ("springProfile")
public class ProfileServiceOneImpl implements MyService{
    @Override
    public String getMyService() {
        return "Profile service - ProfileServiceOneImpl";
    }
}
