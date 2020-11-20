package com.learn.java.design.model.bridge.enums;

import com.learn.java.design.model.bridge.content.CardContent;
import com.learn.java.design.model.bridge.content.LiveContent;
import com.learn.java.design.model.bridge.content.SpecialContent;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author hhs
 * @since 2020/11/20 15:56
 */
@Getter
@AllArgsConstructor
public enum CardContentType {

    // 专题
    SPECIAL("special", "专题", SpecialContent.class),
    // 直播
    LIVE("live", "直播", LiveContent.class),

    ;

    private String key;

    private String value;

    private Class<? extends CardContent> contentClass;

    public static CardContentType getByKey(String key) {
        return Arrays.stream(CardContentType.values()).filter(c -> c.getKey().equals(key)).findAny().orElse(null);
    }
}
