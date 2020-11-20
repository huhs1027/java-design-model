package com.learn.java.design.model.bridge.enums;

import com.learn.java.design.model.bridge.css.CardCss;
import com.learn.java.design.model.bridge.css.CardCss1;
import com.learn.java.design.model.bridge.css.CardCss2;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author hhs
 * @since 2020/11/20 15:56
 */
@Getter
@AllArgsConstructor
public enum CardCssType {

    STYLE1("style1", "样式1", CardCss1.class),
    STYLE2("style2", "样式2", CardCss2.class),

    ;

    private String key;

    private String value;

    private Class<? extends CardCss> cssClass;

    public static CardCssType getByKey(String key) {
        return Arrays.stream(CardCssType.values()).filter(c -> c.getKey().equals(key)).findAny().orElse(null);
    }
}
