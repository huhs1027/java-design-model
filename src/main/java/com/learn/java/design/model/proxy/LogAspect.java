package com.learn.java.design.model.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/19 16:08
 */
@Aspect
@Component
public class LogAspect {

    /**
     * 切入点,给advice做方法签名
     */
    @Pointcut("@annotation(com.learn.java.design.model.proxy.Log)")
    public void logPointCut() {
        // pointcut
    }

    @Around("logPointCut()")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("代理日志记录...");
        return pjp.proceed();
    }

}
