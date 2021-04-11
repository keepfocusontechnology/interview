package test.design.proxy_mode;

import test.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

    public IDynamicProxy i;

    public DynamicProxy(IDynamicProxy i) {
        this.i = i;
    }

    public Object getProxyIns(){
        return Proxy.newProxyInstance(
                i.getClass().getClassLoader(),
                i.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        LogUtils.logLn("before doAction");
                        final Object invoke = method.invoke(i, args);
                        LogUtils.logLn("after doAction");
                        return invoke;
                    }
                }
        );
    }
}
