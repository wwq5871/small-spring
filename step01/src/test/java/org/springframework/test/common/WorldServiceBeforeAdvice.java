package org.springframework.test.common;

import org.springframework.aop.BeforeAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/03/17:24
 */
public class WorldServiceBeforeAdvice implements BeforeAdvice {


    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("BeforeAdvice: do something before the earth explodes");
    }
}
