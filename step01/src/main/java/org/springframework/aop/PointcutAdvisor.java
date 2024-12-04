package org.springframework.aop;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/04/16:33
 */
public interface PointcutAdvisor extends Advisor{

    Pointcut getPointcut();
}
