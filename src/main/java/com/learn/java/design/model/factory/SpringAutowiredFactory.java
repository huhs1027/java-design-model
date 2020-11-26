package com.learn.java.design.model.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hhs
 * @since 2020/10/29 22:03
 * 通过Autowired注入
 */
@Component
public class SpringAutowiredFactory {

    private static ApplicationContext applicationContext;

    /**
     * 直接注入
     *
     * @see AutowiredAnnotationBeanPostProcessor
     */
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringAutowiredFactory.applicationContext = applicationContext;
    }

    public static <T> T getBean(String beanName, Class<T> tClass) {
        return applicationContext.getBean(beanName, tClass);
    }

    public static <T> T getBean(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

    public static <T> List<T> getBeans(Class<T> tClass) {
        ArrayList<T> tList = new ArrayList<>();
        Map<String, T> beansOfType = applicationContext.getBeansOfType(tClass);
        tList.addAll(beansOfType.values());
        return tList;
    }
}
