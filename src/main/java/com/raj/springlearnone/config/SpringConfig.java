package com.raj.springlearnone.config;

import com.raj.springlearnone.datasource.PropertiesDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("classpath:datasource.properties")
@Configuration
@EnableConfigurationProperties(SpringConstructorConfig.class)
public class SpringConfig {

/*    @Bean
    public PropertiesDataSource propertiesDataSource(@Value("${raj.user.username}") String user,
                                                     @Value("${raj.user.password}") String password,
                                                     @Value("${raj.user.dbUrl}") String url){
        PropertiesDataSource propertiesDataSource = new PropertiesDataSource();
        propertiesDataSource.setDbUrl(url);
        propertiesDataSource.setUserName(user);
        propertiesDataSource.setPassword(password);

        return propertiesDataSource;

    }*/

    @Bean
    public PropertiesDataSource propertiesDataSource(SpringConstructorConfig springConstructorConfig){
        PropertiesDataSource propertiesDataSource = new PropertiesDataSource();
        propertiesDataSource.setDbUrl(springConstructorConfig.getDbUrl());
        propertiesDataSource.setUserName(springConstructorConfig.getUsername());
        propertiesDataSource.setPassword(springConstructorConfig.getPassword());

        return propertiesDataSource;

    }



}
