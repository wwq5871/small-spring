package org.springframework.core.io;

/**
 * @author mikael wang
 * @date 2024/9/28 13:11
 */
public interface ResourceLoader {

    Resource getResource(String location);

}
