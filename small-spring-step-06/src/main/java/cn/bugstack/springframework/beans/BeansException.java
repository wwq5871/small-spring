package cn.bugstack.springframework.beans;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/14:55
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }


    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
