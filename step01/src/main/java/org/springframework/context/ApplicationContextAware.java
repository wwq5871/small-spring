package org.springframework.context;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/09/9:06
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
