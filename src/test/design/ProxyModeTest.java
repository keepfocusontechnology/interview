package test.design;

import test.design.proxy_mode.Delegation;
import test.design.proxy_mode.DynamicProxy;
import test.design.proxy_mode.IDynamicProxy;

public class ProxyModeTest {

    public static void main(String[] args) {
        //动态代理

        IDynamicProxy dynamicProxy = new Delegation();
        IDynamicProxy service  = (IDynamicProxy)new DynamicProxy(dynamicProxy).getProxyIns();
        service.doAction("哈哈哈 ");

    }
}
