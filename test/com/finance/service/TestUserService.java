package com.finance.service;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

    @Test
    public void testQueryAge() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        
        System.out.println(userService.queryAge());
    }

    @Test
    public void testQuery() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.query();
    }

    @Test
    public void testQueryByBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.queryByBean();
    }

    @Test
    public void testTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.updateMoney();

    }

}
