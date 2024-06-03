package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/03/19:54
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
