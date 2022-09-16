package com.kk.configuration.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "users")
public class MyUsers {
    private String name;
    private Integer age;
}
