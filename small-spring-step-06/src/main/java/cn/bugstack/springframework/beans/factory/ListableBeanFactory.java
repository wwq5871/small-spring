package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

import java.util.Map;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/15:05
 */
public interface ListableBeanFactory extends BeanFactory{
    /**
     * 按照类型返回Bean实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();

}
