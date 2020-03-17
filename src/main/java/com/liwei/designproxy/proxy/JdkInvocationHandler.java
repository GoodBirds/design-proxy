package com.liwei.designproxy.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 *
 * @author liwei
 * @create: 2020/3/17 11:10 下午
 */
@Slf4j
public class JdkInvocationHandler implements InvocationHandler {

    /**
     * 目标代理对象
     */
    private Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 获取代理对象接口
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info(">>>日志收集开始>>>>");
        // 执行代理对象方法
        Object invoke = method.invoke(target, args);
        log.info(">>>日志收集结束>>>>");
        return invoke;
    }

}
