package org.springframework.beans.factory;

/**
 * @author mikael wang
 * @date 2024/10/7 22:34
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
