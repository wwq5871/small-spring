package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/04/9:57
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
