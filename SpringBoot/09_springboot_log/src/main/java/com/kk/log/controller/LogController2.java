package com.kk.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController2 {

    @GetMapping("/")
    public String get() {
        log.info("This is a logger");
        return ":";
    };
}
