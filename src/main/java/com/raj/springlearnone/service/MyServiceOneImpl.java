package com.raj.springlearnone.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceOneImpl implements MyService{
    @Override
    public String getMyService() {
        return "My service - MyServiceOneImpl";
    }
}
