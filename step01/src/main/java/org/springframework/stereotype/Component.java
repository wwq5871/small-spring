package org.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/06/9:14
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}
