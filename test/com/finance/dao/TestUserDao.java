package com.finance.dao;

import com.finance.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    @Test
    public void testGetName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserDao user = (UserDao) context.getBean("userDao");
        System.out.println(user.getName());
    }


}
