package com.kk.mybatis.service;

import com.kk.mybatis.pojo.Book;

public interface BookService {
    public abstract Book getById(Integer id);
}
