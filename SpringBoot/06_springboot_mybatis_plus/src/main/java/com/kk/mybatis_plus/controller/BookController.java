package com.kk.mybatis_plus.controller;

import com.kk.mybatis_plus.pojo.Book;
import com.kk.mybatis_plus.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public Book getById() {
        return bookService.getById(1);
    }
}
