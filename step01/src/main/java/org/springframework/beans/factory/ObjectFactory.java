package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/16/15:24
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
