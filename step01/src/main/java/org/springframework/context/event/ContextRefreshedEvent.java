package org.springframework.context.event;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/10:29
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
