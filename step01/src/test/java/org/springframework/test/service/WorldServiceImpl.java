package org.springframework.test.service;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/02/17:57
 */
public class WorldServiceImpl implements WorldService{

    private String name;

    @Override
    public void explode() {
        System.out.println("The Earth is going to explode");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
