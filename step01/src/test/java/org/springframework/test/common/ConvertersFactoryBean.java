package org.springframework.test.common;

import org.springframework.beans.factory.FactoryBean;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/13/15:11
 */
public class ConvertersFactoryBean implements FactoryBean<Set<?>> {
    @Override
    public Set<?> getObject() throws Exception {
        HashSet<Object> converters = new HashSet<>();
        StringToLocalDateConverter stringToLocalDateConverter = new StringToLocalDateConverter("yyyy-MM-dd");
        converters.add(stringToLocalDateConverter);
        return converters;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
