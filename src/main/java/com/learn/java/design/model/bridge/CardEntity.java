package com.learn.java.design.model.bridge;

import lombok.Data;

/**
 * @author hhs
 * @since 2020/11/20 15:58
 * 卡片数据库实体类
 */
@Data
public class CardEntity {

    /**
     * 卡片样式
     */
    private String style;

    /**
     * 卡片类型
     */
    private String type;

    /**
     * 卡片内容
     */
    private String content;

    // ....其他属性
}
