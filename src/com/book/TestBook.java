package com.book;

import com.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("book.xml");
        BookController bookController=ac.getBean("bookController",BookController.class);
//        bookController.buyBook();
        bookController.checkOut();
    }
}
