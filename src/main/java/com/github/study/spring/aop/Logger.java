package com.github.study.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class Logger {

    @Pointcut("execution(* com.github.study.spring.bean.*.*())")
    public void selectAllMethodsAvailable() {

    }

    @Before("selectAllMethodsAvailable()")
    public void beforeAdvice() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @After("selectAllMethodsAvailable()")
    public void afterAdvice() {
        System.out.println(getClass().getSimpleName() + " after");
    }

    @AfterReturning(pointcut = "selectAllMethodsAvailable()", returning = "someValue")
    public void afterReturningAdvice(Object someValue) {
        System.out.println(getClass().getSimpleName() + " return: " + someValue.toString());
    }

    @AfterThrowing(pointcut = "selectAllMethodsAvailable()", throwing = "e")
    public void inCaseOfExceptionThrowAdvice(ClassCastException e) {
        System.out.println(getClass().getSimpleName() + " oops: " + e.toString());
    }

}
