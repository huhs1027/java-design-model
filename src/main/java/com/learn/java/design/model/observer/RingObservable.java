package com.learn.java.design.model.observer;

import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * @author hhs
 * @since 2020/11/26 16:08
 * 铃声目标类
 */
@Component
public class RingObservable extends Observable {


    /**
     * 上课铃声
     *
     * @param classBegin true上课铃 false下课铃
     */
    public void bellRang(boolean classBegin) {
        setChanged();
        notifyObservers(classBegin);
    }

}
