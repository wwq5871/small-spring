package org.springframework.context.event;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/10:28
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    public ContextClosedEvent(Object source) {
        super(source);
    }
}
