package com.example.multipledatabaseapp.db1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.db1")
public class Db1Properties {

    private String url;
    private String username;
    private String password;
    private String driverClassName;

}
