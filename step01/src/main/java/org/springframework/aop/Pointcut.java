package org.springframework.aop;

/**
 * @description:
 * @author: wwq
 * @date: 2024/11/20/9:36
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
