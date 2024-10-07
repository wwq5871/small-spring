package org.springframework.context;

import org.springframework.beans.BeansException;

/**
 * @author mikael wang
 * @date 2024/10/6 14:36
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
