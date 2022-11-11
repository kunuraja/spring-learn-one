package com.raj.springlearnone.config;

import com.raj.springlearnone.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ComponentConfigs {

    @Bean
    public MyService myServiceOneImpl(){
        return new MyServiceOneImpl();
    }

    @Bean
    public MyService myServiceTwoImpl(){
        return new MyServiceTwoImpl();
    }

    @Bean
    @Primary
    public MyService primaryBeanImpl(){
        return new PrimaryBeanImpl();
    }

    @Bean("profileService")
    @Profile("profile1")
    public MyService profileOne(){
        return new ProfileOneImpl();
    }


    @Profile("profile2")
    @Bean
    public MyService profileService(){
        return new ProfileTwoImpl();
    }

}
