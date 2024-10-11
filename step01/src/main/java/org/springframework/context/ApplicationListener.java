package org.springframework.context;

import java.util.EventListener;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/9:04
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
