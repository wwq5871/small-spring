package org.springframework.test.bean;

import org.springframework.stereotype.Component;

/**
 * @author mikael wang
 * @date 2024/9/28 11:57
 */
@Component
public class Car {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
