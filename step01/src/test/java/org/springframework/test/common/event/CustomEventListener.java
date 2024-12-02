package org.springframework.test.common.event;

import org.springframework.context.ApplicationListener;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/11/10:32
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(this.getClass().getName());
    }
}
