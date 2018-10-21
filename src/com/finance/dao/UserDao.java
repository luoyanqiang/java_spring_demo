package com.finance.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public UserDao() {
    }

    public UserDao(String name) {
        System.out.println("sssb");
    }
    
    public void add() {
        System.out.println("sss");
    }

    public List queryByBean() {
        String sql = "select * from user";
        List list = jdbcTemplate.queryForList(sql);
        return list;
    }

    public void decMoney() {
        String sql = "update user set money = money + ? where name = ?";
        jdbcTemplate.update(sql, -100, "lisi");
    }

    public void incMoney() {
        String sql = "update user set money = money + ? where name = ?";
        jdbcTemplate.update(sql, 100, "wangwu");
    }

}
