package cn.bugstack.springframework.util;

import cn.hutool.core.util.ClassUtil;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/16:30
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
