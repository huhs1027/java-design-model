package com.learn.java.design.model.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author hhs
 * @since 2020/11/26 9:34
 * 短信渠道商1
 */
@Slf4j
@Service
public class Channel3SmsSend extends AbstractSmsTemplate {
    @Override
    protected String getToken() {
        return "渠道商3token";
    }

    @Override
    protected void send(String token) {
        log.info("渠道商3短信发送啦.");
    }
}
