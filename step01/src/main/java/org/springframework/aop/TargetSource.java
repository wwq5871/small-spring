package org.springframework.aop;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/02/17:20
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Class<?>[] getTargetClass() {
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget() {
        return this.target;
    }

}

