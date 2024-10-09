package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/08/14:38
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
