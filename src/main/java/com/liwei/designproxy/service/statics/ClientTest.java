package com.liwei.designproxy.service.statics;


/**
 * 测试
 * @author liwei
 * @create: 2020/3/17 10:56 下午
 */
public class ClientTest {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy();
        orderService.order();
    }
}
