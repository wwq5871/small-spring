package org.springframework.core.convert.converter;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/11/16:21
 */
public interface ConverterFactory<S, R> {

    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
