package test.design.proxy_mode;


import test.LogUtils;

/**
 * delegation 委托类，执行核心
 */
public class Delegation implements IDynamicProxy {

    @Override
    public void doAction(String str) {
        LogUtils.logLn("DynamicProxyImpl：" + str);  //执行输出
    }
}
