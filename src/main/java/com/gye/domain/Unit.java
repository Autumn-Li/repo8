package com.gye.domain;

public class Unit {

    private Integer id;//单位表id
    private String unitname;//单位名称
    private String address;//单位地址
    private Integer number;//税号
    private String linkman;//联系人
    private String phone;//联系人电话

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", unitname='" + unitname + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", linkman='" + linkman + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
