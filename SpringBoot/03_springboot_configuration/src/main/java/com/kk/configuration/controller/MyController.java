package com.kk.configuration.controller;

import com.kk.configuration.configuration.MyUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value(value = "${country}")
    private String country;

    @Value(value = "${users.name}")
    private String usersName;
    @Value(value = "${users.age}")
    private Integer usersAge;

    @Value(value = "${user1[0].name}")
    private String user10Name;
    @Value(value = "${user1[0].age}")
    private Integer user10Age;
    @Value(value = "${user1[1].name}")
    private String user11Name;
    @Value(value = "${user1[1].age}")
    private Integer user11Age;

    @Value(value = "${likes[0]}")
    private String likes0;
    @Value(value = "${likes[1]}")
    private String likes1;
    @Value(value = "${likes[2]}")
    private String likes2;

    @Value(value = "${likes1[0]}")
    private String likes10;
    @Value(value = "${likes1[1]}")
    private String likes11;
    @Value(value = "${likes1[2]}")
    private String likes12;

    @Autowired
    private Environment environment;

    @Autowired
    private MyUsers myUsers;

    @GetMapping("/")
    public String configValue() {
        //return country + usersName + usersAge + user10Name + user10Age + user11Name + user11Age + likes0 + likes1 + likes2 + likes10 + likes11 + likes12 + "\n" + environment.getProperty("likes[0]");
        return myUsers.toString();
    }
}
