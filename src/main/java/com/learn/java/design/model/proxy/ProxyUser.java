package com.learn.java.design.model.proxy;

import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/19 15:23
 */
@Component
public class ProxyUser {

    @Log
    public void process() {
        System.out.println("proxyUser方法执行了");
    }

}
