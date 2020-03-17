package com.liwei.designproxy.service.statics;

import com.liwei.designproxy.service.statics.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liwei
 * @create: 2020/3/17 11:00 下午
 */
@Slf4j
public class OrderServiceProxy extends OrderServiceImpl {

    @Override
    public void order() {
        log.info("日志收集开始..");
        super.order();
        log.info("日志收集结束..");
    }
}
