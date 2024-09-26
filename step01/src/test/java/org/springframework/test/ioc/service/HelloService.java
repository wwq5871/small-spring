package org.springframework.test.ioc.service;

/**
 * @author mikael wang
 * @date 2024/9/23 21:07
 */
public class HelloService {

    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
