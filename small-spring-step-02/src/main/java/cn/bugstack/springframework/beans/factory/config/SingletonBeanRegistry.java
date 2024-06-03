package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/03/19:45
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
