package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/03/19:38
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
