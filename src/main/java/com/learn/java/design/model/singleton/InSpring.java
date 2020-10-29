package com.learn.java.design.model.singleton;

import org.springframework.beans.factory.annotation.Autowired;
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
    }

}


class Test {

    @Autowired
    private InSpring inSpring;

    public void method() {
        // inSpring 逻辑处理
    }

}