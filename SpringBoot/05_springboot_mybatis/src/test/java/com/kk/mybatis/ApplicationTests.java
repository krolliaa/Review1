package com.kk.mybatis;

import com.kk.mybatis.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
    }

}
