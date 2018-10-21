package com.finance.service;

import com.finance.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class UserService {
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    public Integer queryAge() {
        return userDao.getAge();
    }

    public void query() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.33.12/finance");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "select * from user";
        List list = jdbcTemplate.queryForList(sql);
        for(Object o : list) {
            System.out.println(o);
        }
        
    }

    public void queryByBean() {
        List list = userDao.queryByBean();
        System.out.println(list);
    }

    public void updateMoney() {
        userDao.decMoney();
        userDao.incMoney();
    }

}
