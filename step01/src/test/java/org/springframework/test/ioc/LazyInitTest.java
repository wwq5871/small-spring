package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/16/19:28
 */
public class LazyInitTest {

    @Test
    public void testLazyInit() throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:lazy-test.xml");
        System.out.println(System.currentTimeMillis() + ":applicationContext-over");
        TimeUnit.SECONDS.sleep(2);
        Car car = (Car) applicationContext.getBean("car");
        car.showTime();
    }
}
