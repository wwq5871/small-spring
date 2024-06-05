package cn.bugstack.springframework.beans;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/05/15:18
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
