package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

import java.beans.Beans;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mikael wang
 * @date 2024/9/23 20:18
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param name
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;

    /**
     * 根据名称和类型查找bean
     * @param name
     * @param requiredType
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;
}
