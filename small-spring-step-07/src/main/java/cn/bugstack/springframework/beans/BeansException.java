package cn.bugstack.springframework.beans;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/12/17:34
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable e) {
        super(msg, e);
    }
}
