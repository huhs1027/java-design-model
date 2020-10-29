package com.learn.java.design.model.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/10/27 18:51
 */
@Component
public class SpringBootFactory {

    /**
     * spring-boot可以直接@autoword
     */
    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 获取bean
     *
     * @param beanName 名称
     * @param tClass   类型
     * @return T
     */
    public <T> T getBean(String beanName, Class<T> tClass) {
        return applicationContext.getBean(beanName, tClass);
    }


}
