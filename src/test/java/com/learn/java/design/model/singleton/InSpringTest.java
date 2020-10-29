package com.learn.java.design.model.singleton;

import com.learn.java.design.model.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hhs
 * @since 2020/10/29 15:45
 */
public class InSpringTest extends BaseTest {

    @Autowired
    private InSpring inSpring;

    @Autowired
    private InSpring inSpring2;

    @Test
    public void test() {
        inSpring.process();
        inSpring2.process();
        System.out.println(inSpring == inSpring2);
    }
}