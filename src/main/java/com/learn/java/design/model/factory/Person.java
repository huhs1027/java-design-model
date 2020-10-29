package com.learn.java.design.model.factory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/10/29 22:11
 * 用于测试人类
 */
@Component
@Getter
@Setter
@ToString
public class Person {

    private String name = "hahaha";

    private Integer age = 100;

}
