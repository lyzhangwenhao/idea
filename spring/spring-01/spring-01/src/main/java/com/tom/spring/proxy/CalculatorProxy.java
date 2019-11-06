package com.tom.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * ClassName: CalculatorProxy
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 23:09
 */
public class CalculatorProxy {
    private Object target;

    public CalculatorProxy(Object target){
        this.target=target;
    }

    public Object getProxy(){

        Object proxy;
        /**
         *  loader: ClassLoader对象。类加载器对象，用来生成代理类
         *  interfaces: 目标对象的所有的接口
         *
         */
        /*获取类加载器*/
        ClassLoader loader = target.getClass().getClassLoader();
        /*获取所有接口*/
        Class<?>[] interfaces = target.getClass().getInterfaces();

        proxy = Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("The method "+method.getName()+" begins  ===> "+ Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("The method "+method.getName()+" ends ===> "+ result);
                return result;
            }
        });
        return proxy;
    }
}
