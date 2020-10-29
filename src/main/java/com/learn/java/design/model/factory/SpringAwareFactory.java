package com.learn.java.design.model.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/10/29 20:08
 */
@Component
public class SpringAwareFactory implements ApplicationContextAware {

    /**
     * set设置
     *
     * @see ApplicationContextAwareProcessor
     */
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringAwareFactory.applicationContext = applicationContext;
    }


    public static <T> T getBean(String beanName, Class<T> tClass) {
        return applicationContext.getBean(beanName, tClass);
    }

}
