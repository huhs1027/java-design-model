package com.learn.java.design.model.chain;

/**
 * @author hhs
 * @since 2020/11/26 10:43
 * 责任链
 */
public interface Chain {

    /**
     * 设置下一个
     */
    void setNext(Chain chain);

    /**
     * 执行链
     */
    boolean doChain(String type);

}
