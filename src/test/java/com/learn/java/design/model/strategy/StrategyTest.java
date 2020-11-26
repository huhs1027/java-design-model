package com.learn.java.design.model.strategy;

import com.learn.java.design.model.BaseTest;
import com.learn.java.design.model.factory.SpringAutowiredFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author hhs
 * @since 2020/11/26 10:19
 */
public class StrategyTest extends BaseTest {

    @Test
    public void test() {
        // 执行策略1 策略名字可以存到枚举,常量,配置文件里的等
        String type = "strategy1";
        List<Strategy> beans = SpringAutowiredFactory.getBeans(Strategy.class);
        for (Strategy strategy : beans) {
            if (type.equals(strategy.strategyType())) {
                strategy.doStrategy();
                break;
            }
        }
    }
}
