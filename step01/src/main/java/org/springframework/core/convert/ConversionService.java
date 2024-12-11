package org.springframework.core.convert;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/11/17:03
 */
public interface ConversionService {

    boolean canConvert(Class<?> sourceType, Class<?> targetType);

    <T> T convert(Object source, Class<T> targetSource);
}
