package com.raj.springlearnone.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceTwoImpl implements MyService{
    @Override
    public String getMyService() {
        return "My Service - MyServiceTwoImpl";
    }
}
