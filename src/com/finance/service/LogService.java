package com.finance.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogService {

    public void write() {
        System.out.println("write log");
    }


    @After(value = "execution(* com.finance.service.BookService.buyBook(..))")
    public void read() {
        System.out.println("read log");
    }

    @Around(value = "execution(* com.finance.service.BookService.buyBook())")
    public void circle(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before");
        point.proceed();
        System.out.println("around after");

    }

}
