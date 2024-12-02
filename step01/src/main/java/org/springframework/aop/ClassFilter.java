package org.springframework.aop;

/**
 * @description:
 * @author: wwq
 * @date: 2024/11/20/9:34
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
