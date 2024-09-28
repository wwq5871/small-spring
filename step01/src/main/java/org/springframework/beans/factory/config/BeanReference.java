package org.springframework.beans.factory.config;

/**
 * @author mikael wang
 * @date 2024/9/27 23:28
 */
public class BeanReference {

    private final String beanName;


    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
