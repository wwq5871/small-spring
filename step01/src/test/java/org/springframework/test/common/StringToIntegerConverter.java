package org.springframework.test.common;

import org.springframework.core.convert.converter.Converter;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/12/11:30
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
