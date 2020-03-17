package com.liwei.designproxy.cglib;

import com.liwei.designproxy.service.statics.dynamic.cglib.OrderServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * 测试
 *
 * @author liwei
 * @create: 2020/3/17 11:32 下午
 */
public class ClientTest {
    public static void main(String[] args) {
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();

        //生成代理类保存路径
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/liwei/IdeaProjects/design-proxy/code");
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类
        enhancer.setSuperclass(OrderServiceImpl.class);
        // 设置回调对象
        enhancer.setCallback(cglibMethodInterceptor);
        //创建代理对象
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();

    }
}
