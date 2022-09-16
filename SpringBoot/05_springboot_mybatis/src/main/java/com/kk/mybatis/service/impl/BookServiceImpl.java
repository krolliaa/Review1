package com.kk.mybatis.service.impl;

import com.kk.mybatis.mapper.BookMapper;
import com.kk.mybatis.pojo.Book;
import com.kk.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }
}
