package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/15:32
 */
public interface BeanPostProcessor {
    /**
     * 在Bean对象执行初始化方法之前, 执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在Bean对象执行初始化方法之后,执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
