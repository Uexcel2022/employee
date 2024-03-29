package com.uexcel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String address;

    public Employee(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

}
