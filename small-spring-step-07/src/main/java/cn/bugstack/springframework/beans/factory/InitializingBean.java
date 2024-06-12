package cn.bugstack.springframework.beans.factory;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/12/17:28
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
