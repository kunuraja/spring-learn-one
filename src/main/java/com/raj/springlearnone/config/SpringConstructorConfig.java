package com.raj.springlearnone.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("raj.user")
@ConstructorBinding
public class SpringConstructorConfig {
    private String username;
    private String password;
    private String dbUrl;

    public SpringConstructorConfig(String username, String password, String dbUrl) {
        this.username = username;
        this.password = password;
        this.dbUrl = dbUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDbUrl() {
        return dbUrl;
    }
}
