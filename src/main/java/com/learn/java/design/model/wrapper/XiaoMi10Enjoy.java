package com.learn.java.design.model.wrapper;

/**
 * @author hhs
 * @since 2020/11/23 19:42
 * 小米10尊享版
 */
public class XiaoMi10Enjoy implements Phone {

    private XiaoMI10 phone;

    public XiaoMi10Enjoy(XiaoMI10 phone) {
        this.phone = phone;
    }

    @Override
    public void info() {
        // 尊享
        phone.setPhoneName("小米10尊享版");
        phone.setChip("晓龙865 plus");
        phone.info();
    }
}
