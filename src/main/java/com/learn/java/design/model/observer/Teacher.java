package com.learn.java.design.model.observer;

import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

/**
 * @author hhs
 * @since 2020/11/26 16:08
 * 老师观察者类
 */
@Component
public class Teacher implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        boolean classBegin = (boolean) arg;
        if (classBegin) {
            System.out.println("老师上课了");
        } else {
            System.out.println("老师拖堂了");
        }
    }

}
