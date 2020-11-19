package com.learn.java.design.model.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/10/29 20:08
 * 构造注入
 */
@Component
public class SpringStructureFactory {

    private static ApplicationContext applicationContext;

    public SpringStructureFactory(ApplicationContext applicationContext) {
        SpringStructureFactory.applicationContext = applicationContext;
    }


    public static <T> T getBean(String beanName, Class<T> tClass) {
        return applicationContext.getBean(beanName, tClass);
    }

}
