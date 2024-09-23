package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author mikael wang
 * @date 2024/9/23 21:34
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
