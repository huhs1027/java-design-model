package com.learn.java.design.model.factory;

import com.learn.java.design.model.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * @author hhs
 * @since 2020/10/29 20:36
 * 整合spring的工厂模式测试
 */
public class SpringFactoryTest extends BaseTest {

    @Test
    public void test() {
        Person person = SpringAutowiredFactory.getBean("person", Person.class);
        System.out.println(person.toString());

        Person person1 = SpringAwareFactory.getBean("person", Person.class);
        System.out.println(person1.toString());

        Person person2 = SpringStructureFactory.getBean("person", Person.class);
        System.out.println(person2.toString());
    }

}