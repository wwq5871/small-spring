package org.springframework.test.ioc.bean;

/**
 * @author mikael wang
 * @date 2024/9/28 11:57
 */
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
