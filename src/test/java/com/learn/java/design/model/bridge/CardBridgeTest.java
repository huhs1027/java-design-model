package com.learn.java.design.model.bridge;

import com.learn.java.design.model.BaseTest;
import com.learn.java.design.model.bridge.content.CardContent;
import com.learn.java.design.model.bridge.css.CardCss;
import com.learn.java.design.model.bridge.enums.CardContentType;
import com.learn.java.design.model.bridge.enums.CardCssType;
import com.learn.java.design.model.bridge.enums.CardTypeEnum;
import com.learn.java.design.model.bridge.type.CardType;
import com.learn.java.design.model.factory.SpringAutowiredFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author hhs
 * @since 2020/11/20 16:02
 */
public class CardBridgeTest extends BaseTest {

    // 卡片1
    private CardEntity cardEntity1;

    // 卡片2
    private CardEntity cardEntity2;

    @BeforeEach
    public void before() {
        // 模拟数据库查出来的数据
        cardEntity1 = new CardEntity();
        cardEntity1.setStyle(CardCssType.STYLE1.getKey());
        cardEntity1.setType(CardTypeEnum.PIC.getKey());
        cardEntity1.setContent(CardContentType.SPECIAL.getKey());

        // 模拟数据库查出来的数据
        cardEntity2 = new CardEntity();
        cardEntity2.setStyle(CardCssType.STYLE2.getKey());
        cardEntity2.setType(CardTypeEnum.TEXT.getKey());
        cardEntity2.setContent(CardContentType.LIVE.getKey());
    }

    @Test
    public void test() {
        // 卡片1
        {
            CardCss cardCss = SpringAutowiredFactory.getBean(CardCssType.getByKey(cardEntity1.getStyle()).getCssClass());
            CardType cardType = SpringAutowiredFactory.getBean(CardTypeEnum.getByKey(cardEntity1.getType()).getTypeClass());
            CardContent cardContent = SpringAutowiredFactory.getBean(CardContentType.getByKey(cardEntity1.getContent()).getContentClass());

            CardDTO cardDTO = new CardDTO();
            cardDTO.setCardCss(cardCss);
            cardDTO.setCardType(cardType);
            cardDTO.setCardContent(cardContent);
            cardDTO.process();
        }
        System.out.println("================================");
        // 卡片2
        {
            CardCss cardCss = SpringAutowiredFactory.getBean(CardCssType.getByKey(cardEntity2.getStyle()).getCssClass());
            CardType cardType = SpringAutowiredFactory.getBean(CardTypeEnum.getByKey(cardEntity2.getType()).getTypeClass());
            CardContent cardContent = SpringAutowiredFactory.getBean(CardContentType.getByKey(cardEntity2.getContent()).getContentClass());

            CardDTO cardDTO = new CardDTO();
            cardDTO.setCardCss(cardCss);
            cardDTO.setCardType(cardType);
            cardDTO.setCardContent(cardContent);
            cardDTO.process();
        }

    }

}
