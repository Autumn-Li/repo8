package com.gye.domain;

public class Paytype {

    private Integer id;//收费类型id
    private String payname;//收费名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname;
    }

    @Override
    public String toString() {
        return "Paytype{" +
                "id=" + id +
                ", payname='" + payname + '\'' +
                '}';
    }
}
