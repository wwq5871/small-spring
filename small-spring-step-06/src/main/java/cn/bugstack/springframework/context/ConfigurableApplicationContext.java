package cn.bugstack.springframework.context;

import cn.bugstack.springframework.beans.BeansException;
import javafx.application.Application;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/11/9:57
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
