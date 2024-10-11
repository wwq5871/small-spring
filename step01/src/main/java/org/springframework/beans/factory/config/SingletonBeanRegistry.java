package org.springframework.beans.factory.config;

/**
 * @author mikael wang
 * @date 2024/9/23 20:39
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
