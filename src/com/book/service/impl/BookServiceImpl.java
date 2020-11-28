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
     * propagation: A和B方法都有事務，當A在調用B時，會將A中的事物傳播給B方法，B方法對事務的處理方式就是事物的傳播行為
     * (Propagation.REQUIRED)必須使用調用者的事物
     * (Propagation.REQUIRED_NEW)不使用調用者的事物，使用新的事物進行處裡
     * isolation: 事務的隔離級別，在病發的情況下，操作數據的一種規定
     *      讀未提交 1
     *      讀已提交 2
     *      可重複讀 4
     *      串行化  8
     * timeout: 在事物強制回滾前最多可以執行(等待)的時間
     *
     * readonly:指定當前事務中的一系列操作是否為只讀
     * 若設為只讀，mysql就會在請求訪問數去庫時，不加鎖提高性能
     * 但如果有寫的操作的話不能設置為只讀
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
