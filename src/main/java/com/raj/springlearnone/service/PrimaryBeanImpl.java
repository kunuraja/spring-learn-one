package com.raj.springlearnone.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // This annotation makes the bean primary. So if @Qualifier is not provided and there is conflict in beans then it will by default
// select the bean with @Primary
public class PrimaryBeanImpl implements MyService{
    @Override
    public String getMyService() {
        return "Primary Bean Service - PrimaryBeanImpl";
    }
}
