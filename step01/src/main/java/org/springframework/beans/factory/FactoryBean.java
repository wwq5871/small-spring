package org.springframework.beans.factory;

/**
 * @description:
 * @author: wwq
 * @date: 2024/10/10/16:12
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
