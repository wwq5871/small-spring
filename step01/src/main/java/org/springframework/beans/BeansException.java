package org.springframework.beans;

/**
 * @author mikael wang
 * @date 2024/9/23 20:34
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
