package com.kk.create;

import com.kk.create.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
        BookController bookController = configurableApplicationContext.getBean(BookController.class);
        System.out.println(bookController);
    }
}