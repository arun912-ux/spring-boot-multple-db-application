package com.example.multipledatabaseapp.db2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.db2")
public class Db2Properties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
