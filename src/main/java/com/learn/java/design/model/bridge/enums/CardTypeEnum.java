package com.learn.java.design.model.bridge.enums;

import com.learn.java.design.model.bridge.type.CardType;
import com.learn.java.design.model.bridge.type.TypePic;
import com.learn.java.design.model.bridge.type.TypeText;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author hhs
 * @since 2020/11/20 15:56
 */
@Getter
@AllArgsConstructor
public enum CardTypeEnum {

    PIC("pic", "图片类型", TypePic.class),
    TEXT("text", "文本类型", TypeText.class),

    ;

    private String key;

    private String value;

    private Class<? extends CardType> typeClass;

    public static CardTypeEnum getByKey(String key) {
        return Arrays.stream(CardTypeEnum.values()).filter(c -> c.getKey().equals(key)).findAny().orElse(null);
    }
}
