package com.finance.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookService {

    @Test
    public void testGetBookPrice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.getBookPrice());
    }

    @Test
    public void testBuyBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.buyBook();
    }

}
