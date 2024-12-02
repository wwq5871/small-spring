package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: wwq
 * @date: 2024/11/20/9:35
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
