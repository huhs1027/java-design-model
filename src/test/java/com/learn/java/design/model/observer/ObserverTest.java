package com.learn.java.design.model.observer;

import com.learn.java.design.model.BaseTest;
import com.learn.java.design.model.factory.SpringAutowiredFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Observer;

/**
 * @author hhs
 * @since 2020/11/26 16:32
 */
public class ObserverTest extends BaseTest {

    private RingObservable ringObservable;

    @BeforeEach
    public void before() {
        // 模拟项目启动完毕之后监听机制已建立
        List<Observer> beans = SpringAutowiredFactory.getBeans(Observer.class);
        ringObservable = SpringAutowiredFactory.getBean(RingObservable.class);
        for (Observer bean : beans) {
            ringObservable.addObserver(bean);
        }
    }

    @Test
    public void test() {
        ringObservable.bellRang(true);
        System.out.println("===============================");
        ringObservable.bellRang(false);
    }

}
