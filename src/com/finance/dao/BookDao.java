package com.finance.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BookDao {
    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;


}
