package com.example.spring_assignment;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Address getAdd() {
        return add;
    }
}
