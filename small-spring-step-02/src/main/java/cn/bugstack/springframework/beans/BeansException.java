package cn.bugstack.springframework.beans;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/03/19:55
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
