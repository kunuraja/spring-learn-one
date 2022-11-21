package com.raj.springlearnone.datasource;

public class PropertiesDataSource {
    private String userName;
    private String password;
    private String dbUrl;

    public PropertiesDataSource() {
    }

    public PropertiesDataSource(String userName, String password, String dbUrl) {
        this.userName = userName;
        this.password = password;
        this.dbUrl = dbUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
