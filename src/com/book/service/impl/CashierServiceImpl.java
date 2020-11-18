package com.book.service.impl;

import com.book.service.BookService;
import com.book.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CashierServiceImpl implements Cashier {


    @Autowired
    private BookService bookService;

    @Autowired
    private Cashier cashier;

    public void buyBook(){

    }


    @Override
    public void checkOut(String mid, List<String> bids) {
        for (String bid : bids) {
            bookService.buyBook(bid, mid);
        }
    }
}
