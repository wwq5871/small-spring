package org.springframework.test.aop;

import org.junit.Test;
import org.springframework.aop.AdvisedSupport;
import org.springframework.aop.TargetSource;
import org.springframework.test.service.WorldServiceImpl;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/02/17:56
 */
public class DynamicProxyTest {

    @Test
    public void testJdkDynamicProxy() throws Exception {
        WorldServiceImpl worldService = new WorldServiceImpl();

        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(worldService);

    }
}
