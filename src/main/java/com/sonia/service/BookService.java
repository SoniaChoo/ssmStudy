package com.sonia.service;

import com.sonia.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books book);

    int updateBook(Books book);

    int deleteBook(int id);

    Books selectBookById(int id);

    List<Books> selectBookAll();
}
