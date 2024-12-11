package org.springframework.core.convert.converter;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/11/16:21
 */
public interface Converter<S, T> {

    /**
     * 类型转换
     * @param source
     * @return
     */
    T convert(S source);
}
