package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/12/17:50
 */
public class TypeConversionSecondPartTest {

    @Test
    public void testConversionService() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:type-conversion-second-part.xml");

        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car.getPrice()).isEqualTo(1000000);
        assertThat(car.getProduceDate()).isEqualTo(LocalDate.of(2021, 1, 1));
    }
}