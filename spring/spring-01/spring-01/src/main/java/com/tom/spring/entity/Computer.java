package com.tom.spring.entity;

/**
 * ClassName: Computer
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/4 21:22
 */
public class Computer {
    private Integer id;
    private String brand;
    private String color;


    public Computer() {
    }

    public Computer(Integer id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
