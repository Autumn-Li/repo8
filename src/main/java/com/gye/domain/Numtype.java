package com.gye.domain;

public class Numtype {

    private Integer id;//号牌id
    private String name;//号牌名称

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

    @Override
    public String toString() {
        return "Numtype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
