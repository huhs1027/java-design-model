package com.learn.java.design.model.chain;

import lombok.Data;

/**
 * @author hhs
 * @since 2020/11/26 11:12
 */
@Data
public abstract class BaseChain implements Chain {

    private Chain nextChain;

    @Override
    public void setNext(Chain chain) {
        this.nextChain = chain;
    }
}
