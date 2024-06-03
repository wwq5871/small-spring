package cn.bugstack.springframework;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/03/17:30
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
