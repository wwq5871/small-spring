package org.springframework.test.common.event;

import org.springframework.context.event.ApplicationContextEvent;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/10:32
 */
public class CustomEvent extends ApplicationContextEvent {

    public CustomEvent(Object source) {
        super(source);
    }
}
