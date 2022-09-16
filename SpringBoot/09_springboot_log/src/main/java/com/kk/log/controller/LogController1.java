package com.kk.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController1 {

    private static final Logger logger = LoggerFactory.getLogger(LogController1.class);

    @GetMapping("/")
    public String get() {
        logger.info("This is a logger");
        return ":";
    };
}
