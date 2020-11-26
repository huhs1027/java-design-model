package com.learn.java.design.model.template;

import com.learn.java.design.model.BaseTest;
import com.learn.java.design.model.factory.SpringAutowiredFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author hhs
 * @since 2020/11/26 9:41
 */
public class TemplateTest extends BaseTest {


    private AbstractSmsTemplate smsTemplate;

    @BeforeEach
    public void before() {
        // 实际中可以把beanClass配置在db或者配置文件中,以便随时切换.
        smsTemplate = SpringAutowiredFactory.getBean(Channel1SmsSend.class);
    }

    @Test
    public void test() {
        smsTemplate.smsSend();
    }

}
