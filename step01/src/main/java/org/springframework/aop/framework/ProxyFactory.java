package org.springframework.aop.framework;

import org.springframework.aop.AdvisedSupport;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/03/14:27
 */
public class ProxyFactory extends AdvisedSupport{


    public ProxyFactory() {
    }


    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (this.isProxyTargetClass() || this.getTargetSource().getTargetClass().length == 0) {
            return new CglibAopProxy(this);
        }
        return new JdkDynamicAopProxy(this);
    }
}
