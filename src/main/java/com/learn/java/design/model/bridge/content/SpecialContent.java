package com.learn.java.design.model.bridge.content;

import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/20 15:51
 */
@Component
public class SpecialContent implements CardContent {
    @Override
    public String process() {
        return "专题内容";
    }
}
