package com.sonia.dao;

import com.sonia.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books book);

    int updateBook(Books book);

    int deleteBook(@Param("bookID") int id);

    Books selectBookById(@Param("bookID") int id);

    List<Books> selectBookAll();
}
