package com.learn.java.design.model.bridge.css;

import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/20 15:50
 */
@Component
public class CardCss2 implements CardCss {
    @Override
    public String process() {
        return "样式二";
    }
}
