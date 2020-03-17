package com.liwei.designproxy.service.statics.impl;

import com.liwei.designproxy.service.statics.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 订单接口实现类
 *
 * @author liwei
 * @create: 2020/3/17 10:52 下午
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        log.info("用户下单操作...");
    }
}
