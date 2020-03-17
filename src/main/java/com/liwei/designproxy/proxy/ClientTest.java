package com.liwei.designproxy.proxy;

import com.liwei.designproxy.service.statics.OrderService;
import com.liwei.designproxy.service.statics.impl.OrderServiceImpl;

/**
 * 测试
 * @author liwei
 * @create: 2020/3/17 11:15 下午
 */
public class ClientTest {
    public static void main(String[] args) {
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService proxy = jdkInvocationHandler.getProxy();
        proxy.order();
    }
}
