package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/04/16:56
 */
public interface MethodBeforeAdvice extends BeforeAdvice{

    void before(Method method, Object[] args, Object target) throws Throwable;
}
