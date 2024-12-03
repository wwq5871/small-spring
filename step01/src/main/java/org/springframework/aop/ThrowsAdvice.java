package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/03/17:34
 */
public interface ThrowsAdvice extends Advice {

    void throwsHandle(Throwable throwable, Method method, Object[] args, Object target);
}
