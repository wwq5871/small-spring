package org.springframework.core.convert.converter;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/11/16:44
 */
public interface ConverterRegistry {

    void addConverter(Converter<?, ?> converter);

    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

    void addConverter(GenericConverter converter);
}
