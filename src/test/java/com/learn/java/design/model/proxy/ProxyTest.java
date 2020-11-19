package com.learn.java.design.model.proxy;

import com.learn.java.design.model.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hhs
 * @since 2020/11/19 16:14
 */
public class ProxyTest extends BaseTest {

    @Autowired
    private ProxyUser proxyUser;

    @Test
    public void test() {
        proxyUser.process();
    }

}
