package com.learn.java.design.model.singleton;

/**
 * @author hhs
 * @since 2020/10/27 18:36
 */
public class Lhan {

    private static Lhan lhan;

    private Lhan() {
    }

    /**
     * 获取单例对象
     */
    public static Lhan getInstance() {
        // 双重判断
        if (lhan == null) {
            synchronized (Lhan.class) {
                if (lhan == null) {
                    lhan = new Lhan();
                }
            }
        }

        return lhan;
    }

}

class LhanTest {
    public static void main(String[] args) {
        Lhan instance1 = Lhan.getInstance();
        Lhan instance2 = Lhan.getInstance();
        System.out.println(instance1 == instance2); // true
    }
}
