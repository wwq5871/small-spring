package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;

import java.util.Objects;

/**
 * @author mikael wang
 * @date 2024/9/23 20:40
 */
@SuppressWarnings("rawtypes")
public class BeanDefinition {


    private static String SCOPE_SINGLETON = "singleton";

    private static String SCOPE_PROTOTYPE = "prototype";

    private Class beanClass;

    private PropertyValues propertyValues;

    private String initMethodeName;

    private String destroyMethodName;

    private String scope = SCOPE_SINGLETON;

    private boolean singleton = true;

    private boolean prototype = false;

    private boolean lazyInit = false;


    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public boolean isSingleton() {
        return this.singleton;
    }

    public boolean isPrototype() {
        return this.prototype;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodeName() {
        return initMethodeName;
    }

    public void setInitMethodeName(String initMethodeName) {
        this.initMethodeName = initMethodeName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeanDefinition that = (BeanDefinition) o;
        return beanClass.equals(that.beanClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beanClass);
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean b) {
        this.lazyInit = b;
    }
}
