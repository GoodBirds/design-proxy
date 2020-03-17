package com.liwei.designproxy.service.statics.impl;

import com.liwei.designproxy.service.statics.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * 代理类
 *
 * @author liwei
 * @create: 2020/3/17 10:52 下午
 */
@Slf4j
public class OrderServiceProxy implements OrderService {

    private OrderService proxiedOrderService;

    public OrderServiceProxy(OrderService orderService) {
        this.proxiedOrderService = orderService;
    }

    @Override
    public void order() {
        log.info("日志收集开始..");
        proxiedOrderService.order();
        log.info("日志收集结束..");
    }
}
