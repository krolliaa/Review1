package com.kk.mybatis.controller;

import com.kk.mybatis.pojo.Book;
import com.kk.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public Book getById() {
        System.out.println(bookService.getById(1));
        return bookService.getById(1);
    }
}
