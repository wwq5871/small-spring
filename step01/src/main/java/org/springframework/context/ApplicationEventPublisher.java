package org.springframework.context;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/9:50
 */
public interface ApplicationEventPublisher {

    /**
     * 发布事件
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
