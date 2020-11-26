package com.learn.java.design.model.chain;

import com.learn.java.design.model.BaseTest;
import com.learn.java.design.model.factory.SpringAutowiredFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author hhs
 * @since 2020/11/26 13:32
 */
public class ChainTest extends BaseTest {


    private Chain chain;

    @BeforeEach
    public void before() {

        // 提前生成责任链
        Chain lastChain = null;
        List<BaseChain> beans = SpringAutowiredFactory.getBeans(BaseChain.class);
        for (int i = 0; i < beans.size(); i++) {
            BaseChain thisChain = beans.get(i);
            if (i == 0) {
                chain = thisChain;
            }
            if (lastChain != null) {
                lastChain.setNext(thisChain);
            }
            lastChain = thisChain;
        }
    }

    @Test
    public void test() {
        boolean free = chain.doChain("free");
        System.out.println(free);

        System.out.println("==============");

        boolean coupon = chain.doChain("coupon");
        System.out.println(coupon);

        System.out.println("==============");

        boolean vip = chain.doChain("vip");
        System.out.println(vip);

        System.out.println("==============");
        // 不存在的类型
        boolean none = chain.doChain("none");
        System.out.println(none);

    }

}
