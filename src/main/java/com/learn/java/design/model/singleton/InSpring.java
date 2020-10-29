package com.learn.java.design.model.singleton;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author hhs
 * @since 2020/10/29 9:00
 * 用spring模式使用单例模式
 */
@Component
public class InSpring {

    @PostConstruct
    public void init() {
        // 初始化操作
        System.out.println("InSpring init...");
    }

    public void process() {
        System.out.println("我干了什么事情.");
    }

}