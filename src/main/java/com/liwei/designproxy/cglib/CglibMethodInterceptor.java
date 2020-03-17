package com.liwei.designproxy.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liwei
 * @create: 2020/3/17 11:28 下午
 */
@Slf4j
public class CglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        log.info("<<<<<日志收集开始...>>>>>>>");
        Object result = proxy.invokeSuper(obj, args);
        log.info("<<<<<日志收集结束...>>>>>>>");
        return result;
    }
}
