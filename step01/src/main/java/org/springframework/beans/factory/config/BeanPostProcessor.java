package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/04/20:33
 */
public interface BeanPostProcessor {

    /**
     * 在bean执行初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     *在bean初始化方法之后执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
