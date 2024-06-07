package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/15:12
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
