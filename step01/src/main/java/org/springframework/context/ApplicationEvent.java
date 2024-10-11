package org.springframework.context;

import java.util.EventObject;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/9:05
 */
public abstract class ApplicationEvent extends EventObject {


    public ApplicationEvent(Object source) {
        super(source);
    }
}
