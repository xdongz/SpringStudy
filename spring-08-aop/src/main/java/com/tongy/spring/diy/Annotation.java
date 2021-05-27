package com.tongy.spring.diy;

// 方式三：使用注解实现AOP
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这个类是一个切面
public class Annotation {
    @Before("execution(* com.tongy.spring.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* com.tongy.spring.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=====方法执行后=====");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取切入的点
    @Around("execution(* com.tongy.spring.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("====环绕前====");

        Signature signature = jp.getSignature();
        System.out.println("signature:" + signature);

        // 执行方法
        Object proceed = jp.proceed();
        System.out.println("====环绕后====");

    }
}
