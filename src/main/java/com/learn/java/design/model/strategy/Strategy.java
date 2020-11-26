package com.learn.java.design.model.strategy;

/**
 * @author hhs
 * @since 2020/11/26 10:15
 */
public interface Strategy {

    /**
     * 执行策略
     */
    void doStrategy();

    /**
     * 策略类型
     *
     * @return 类型
     */
    String strategyType();

}
