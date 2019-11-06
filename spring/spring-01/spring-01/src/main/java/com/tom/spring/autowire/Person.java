package com.tom.spring.autowire;

/**
 * ClassName: Person
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 17:00
 */
public class Person {
    private Integer id;
    private String name;
    private Car car;
    private Address address;

    public Person() {
    }

    public Person(Integer id, String name, Car car, Address address) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}
