package com.learn.java.design.model.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author hhs
 * @since 2020/11/26 10:16
 */
@Slf4j
@Service
public class Strategy2 implements Strategy {
    @Override
    public void doStrategy() {
        log.info("策略2执行了");
    }

    @Override
    public String strategyType() {
        return "strategy2";
    }
}
