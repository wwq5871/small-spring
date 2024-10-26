package org.springframework.context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/10:24
 */
public abstract class ApplicationContextEvent extends ApplicationEvent {


    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
