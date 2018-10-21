package com.finance.service;

import com.finance.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
    @Resource
    private BookDao bookDao;

    public double getBookPrice() {
        return bookDao.getPrice();
    }

    public void buyBook() {
        System.out.println("buy book...");
    }
    
}
