package org.springframework.beans.factory;

/**
 * @author mikael wang
 * @date 2024/10/7 22:33
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
