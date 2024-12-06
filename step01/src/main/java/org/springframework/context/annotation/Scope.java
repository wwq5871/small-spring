package org.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/06/10:06
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
