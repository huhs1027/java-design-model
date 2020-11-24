package com.learn.java.design.model.wrapper;

import com.learn.java.design.model.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * @author hhs
 * @since 2020/11/23 19:49
 */
public class WrapperTest extends BaseTest {

    @Test
    public void test() {
        XiaoMI10 xiaoMI10 = new XiaoMI10();
        xiaoMI10.info();

        System.out.println("===========================");

        XiaoMi10Enjoy xiaoMi10Enjoy = new XiaoMi10Enjoy(xiaoMI10);
        xiaoMi10Enjoy.info();
    }

}
