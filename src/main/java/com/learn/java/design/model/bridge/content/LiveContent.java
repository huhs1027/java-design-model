package com.learn.java.design.model.bridge.content;

import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/20 15:51
 */
@Component
public class LiveContent implements CardContent {
    @Override
    public String process() {
        return "直播内容";
    }
}
