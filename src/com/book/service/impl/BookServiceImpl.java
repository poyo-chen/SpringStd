package com.book.service.impl;

import com.book.dao.BookDao;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(String bid, String mid) {
        Integer price = bookDao.selectPrice(bid);
        bookDao.updateSt(bid);
        bookDao.updateBalance(mid, price);
    }
}
