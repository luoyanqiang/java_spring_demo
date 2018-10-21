package com.finance.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookDao {

    @Test
    public void testGetPrice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao.getPrice());
        
    }

}
