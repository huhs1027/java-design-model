package com.learn.java.design.model.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author hhs
 * @since 2020/11/26 10:48
 */
@Slf4j
@Scope("prototype")
@Component
public class FreePay extends BaseChain {

    private String ctype = "free";

    @Override
    public boolean doChain(String type) {
        if (ctype.equals(type)) {
            log.info("free类型权限判断");
            return true;
        }
        if (getNextChain() != null) {
            return getNextChain().doChain(type);
        }
        return false;
    }
}
