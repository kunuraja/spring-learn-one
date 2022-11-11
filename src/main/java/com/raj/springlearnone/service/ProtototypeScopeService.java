package com.raj.springlearnone.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtototypeScopeService {
    public ProtototypeScopeService() {
        System.out.println("I am in Prototype ");
    }

    public String getProtype(){
        return "This is prototype";
    }
}
