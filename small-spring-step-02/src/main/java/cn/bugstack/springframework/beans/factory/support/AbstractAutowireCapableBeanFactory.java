package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/03/20:03
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {

        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
