package cn.bugstack.springframework.beans.factory.config;

import cn.hutool.core.bean.OptionalBean;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/06/9:17
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
