package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

import java.util.Map;

/**
 * @description:
 * @author: wwq
 * @date: 2024/09/30/9:28
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 返回指定类型的所有实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回定义的所有bean的名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
