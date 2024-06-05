package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/05/9:56
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
