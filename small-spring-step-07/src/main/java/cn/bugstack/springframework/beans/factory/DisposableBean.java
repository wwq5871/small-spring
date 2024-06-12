package cn.bugstack.springframework.beans.factory;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/12/17:29
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
