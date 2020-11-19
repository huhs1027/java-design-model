package com.learn.java.design.model.singleton;

/**
 * @author hhs
 * @since 2020/10/27 18:42
 * 内部类式
 */
public class InnerClass {

    private InnerClass() {
    }

    private static class InnerClassHolder {
        private static InnerClass innerClass = new InnerClass();
    }

    /**
     * 获取实例
     */
    public static InnerClass getInstance() {
        return InnerClassHolder.innerClass;
    }
}

class InnerClassTest {
    public static void main(String[] args) {
        InnerClass instance1 = InnerClass.getInstance();
        InnerClass instance2 = InnerClass.getInstance();
        // true
        System.out.println(instance1 == instance2);
    }
}