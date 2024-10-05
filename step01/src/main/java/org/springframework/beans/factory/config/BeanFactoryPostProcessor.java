package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/04/17:10
 */
public interface BeanFactoryPostProcessor {

    /**
     *在所有BeanDefinition加载完成后,但在bean实例化之前,提供修改BeanDefinition
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessorBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
