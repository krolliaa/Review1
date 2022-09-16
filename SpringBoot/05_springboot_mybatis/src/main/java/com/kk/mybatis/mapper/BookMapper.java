package com.kk.mybatis.mapper;

import com.kk.mybatis.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("select * from tbl_book where id = ${id}")
    public abstract Book getById(Integer id);
}
