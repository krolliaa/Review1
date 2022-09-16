package com.kk.mybatis_plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kk.mybatis_plus.mapper.BookMapper;
import com.kk.mybatis_plus.pojo.Book;
import com.kk.mybatis_plus.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
