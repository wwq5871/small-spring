package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author mikael wang
 * @date 2024/10/8 22:19
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
