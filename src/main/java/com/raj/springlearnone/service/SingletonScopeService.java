package com.raj.springlearnone.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope
public class SingletonScopeService {

    public SingletonScopeService() {
        System.out.println("I m in Singleton ");
    }

    public String getSingleton(){
        return "This is singleton service";
    }


}
