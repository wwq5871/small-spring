package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/04/16:33
 */
public interface Advisor {

    Advice getAdvice();
}
