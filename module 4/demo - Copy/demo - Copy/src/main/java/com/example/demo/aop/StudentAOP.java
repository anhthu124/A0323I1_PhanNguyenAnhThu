package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAOP {

    @Before(" execution(* com.example.demo.controller.StudentController.showCreateForm(..))")
    public void beforeShowCreateForm(JoinPoint joinPoint){
        System.out.println("Before: " + joinPoint.getSignature().getName());
    }

    @After(" execution(* com.example.demo.controller.StudentController.showCreateForm(..))")
    public void afterShowCreateForm(JoinPoint joinPoint){
        System.out.println("After: " + joinPoint.getSignature().getName());
    }
}
