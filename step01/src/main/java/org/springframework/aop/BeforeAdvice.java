package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/03/17:26
 */
public interface BeforeAdvice extends Advice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
