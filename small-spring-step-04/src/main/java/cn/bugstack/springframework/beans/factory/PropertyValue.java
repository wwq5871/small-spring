package cn.bugstack.springframework.beans.factory;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/04/19:40
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}

