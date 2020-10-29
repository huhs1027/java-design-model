package com.learn.java.design.model.singleton;

/**
 * @author hhs
 * @since 2020/10/27 18:36
 * 单例模式 饿汉式
 */
public class Ehan {

    private static Ehan ehan = new Ehan();

    private Ehan() {
    }

    /**
     * 获取单例对象
     */
    public static Ehan getInstance() {
        return ehan;
    }

}

class EhanTest {

    public static void main(String[] args) {
        Ehan ehan1 = Ehan.getInstance();
        Ehan ehan2 = Ehan.getInstance();
        System.out.println(ehan1 == ehan2); // true
    }

}
