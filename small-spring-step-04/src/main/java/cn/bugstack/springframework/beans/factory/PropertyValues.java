package cn.bugstack.springframework.beans.factory;

import javafx.beans.property.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/04/19:40
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValues = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValues.add(pv);
    }
}
