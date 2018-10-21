package com.finance.controller;

import com.finance.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

public class UserController extends ActionSupport {

    @Override
    public String execute() throws Exception {
        WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
        UserService userService = (UserService) context.getBean("userService");
        userService.query();
        System.out.println("llllllllllluo------------");
        return NONE;
    }
}
