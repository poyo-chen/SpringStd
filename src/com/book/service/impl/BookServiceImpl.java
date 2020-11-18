package com.book.service.impl;

import com.book.dao.BookDao;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    /*
     * @Transactional:對方法中所有操作視為一個事務進行管理
     * 在方法上使用，只對一個方法有效
     * 在類上使用，對類中所有方法有效
     *propagation:
     *
     * isolation:
     *
     * timeout:
     *
     * readonly:
     *
     * rollbackFor | rollbackForClassName |noRollbackFor | noRollbackForClassName
     * */

    @Transactional
    public void buyBook(String bid, String mid) {
        Integer price = bookDao.selectPrice(bid);
        bookDao.updateSt(bid);
        bookDao.updateBalance(mid, price);
    }
}
