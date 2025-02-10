package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.A;
import org.springframework.test.bean.B;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/16/15:11
 */
public class CircularReferenceWithProxyBeanTest {

    @Test
    public void testCircularReference() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:circular-reference-with-proxy-bean.xml");
        A a = applicationContext.getBean("a", A.class);
        B b = applicationContext.getBean("b", B.class);
        a.func();
        assertThat(b.getA() == a).isTrue();
    }
}
