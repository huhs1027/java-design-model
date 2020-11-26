package com.learn.java.design.model.template;

/**
 * @author hhs
 * @since 2020/11/26 9:24
 * 短信发送接口
 */
public interface SmsSend {

    /**
     * 发送短信
     *
     * @return 发送短信
     */
    boolean smsSend();

}
