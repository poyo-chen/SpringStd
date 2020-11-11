package com.book.controller;

import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void  buyBook(){
        bookService.buyBook("1","1001");
    }

}
