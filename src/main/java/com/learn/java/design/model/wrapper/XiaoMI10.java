package com.learn.java.design.model.wrapper;

import lombok.Data;

/**
 * @author hhs
 * @since 2020/11/23 19:24
 * 小米10
 */
@Data
public class XiaoMI10 implements Phone {

    private String brand = "小米";

    private String chip = "骁龙865";

    private String phoneName = "小米10青春版";

    @Override
    public void info() {
        System.out.println("手机品牌:" + brand);
        System.out.println("手机芯片:" + chip);
        System.out.println("手机型号:" + phoneName);
    }
}
