package com.learn.java.design.model.template;

/**
 * @author hhs
 * @since 2020/11/26 9:28
 * 发短信模板类
 */
public abstract class AbstractSmsTemplate implements SmsSend {


    @Override
    public boolean smsSend() {
        // 1.获取token,子类实现
        String token = getToken();
        // 2.发短信前
        beforeSend();
        // 3.发短信
        send(token);
        // 4.发短信后
        afterSend();
        return true;
    }

    /**
     * 获取token
     *
     * @return token
     */
    protected abstract String getToken();

    /**
     * 发短信方法
     */
    protected abstract void send(String token);

    /**
     * 钩子方法,发短信前
     */
    protected void beforeSend() {

    }

    /**
     * 钩子方法,发短信后
     */
    protected void afterSend() {

    }


}
