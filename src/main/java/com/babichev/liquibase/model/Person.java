package com.babichev.liquibase.model;


import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name="height")
    private String height;

    @Column(name = "address")
    private String address;

    public Person() {}

    public Person(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public Person(String name, String height, String address) {
        this.name = name;
        this.height = height;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
