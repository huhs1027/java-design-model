package com.learn.java.design.model.bridge.type;

import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/20 15:52
 */
@Component
public class TypeText implements CardType {
    @Override
    public String process() {
        return "文本类型";
    }
}
