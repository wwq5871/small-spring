package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/04/9:57
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return this.beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }


}
