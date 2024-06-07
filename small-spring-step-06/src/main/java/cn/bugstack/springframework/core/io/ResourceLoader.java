package cn.bugstack.springframework.core.io;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/16:00
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
