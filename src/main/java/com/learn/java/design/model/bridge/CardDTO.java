package com.learn.java.design.model.bridge;

import com.learn.java.design.model.bridge.content.CardContent;
import com.learn.java.design.model.bridge.css.CardCss;
import com.learn.java.design.model.bridge.type.CardType;
import lombok.Data;

/**
 * @author hhs
 * @since 2020/11/20 15:39
 * 卡片数据DTO
 */
@Data
public class CardDTO {

    /**
     * 卡片样式
     */
    private CardCss cardCss;

    /**
     * 卡片类型
     */
    private CardType cardType;

    /**
     * 卡片内容
     */
    private CardContent cardContent;

    public void process() {
        System.out.println("卡片样式:" + cardCss.process());
        System.out.println("卡片类型:" + cardType.process());
        System.out.println("卡片内容:" + cardCss.process());
    }

}
