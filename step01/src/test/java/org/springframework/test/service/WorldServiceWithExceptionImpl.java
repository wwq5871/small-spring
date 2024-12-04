package org.springframework.test.service;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/04/14:41
 */
public class WorldServiceWithExceptionImpl implements WorldService{
    @Override
    public void explode() {
        System.out.println("The earth is going to explode with an Exception");
        throw new RuntimeException();
    }
}
