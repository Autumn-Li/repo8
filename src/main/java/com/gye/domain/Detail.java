package com.gye.domain;

import java.util.List;

public class Detail {

    private Integer id;//收费明细id
    private String numtype;//号牌类型
    private Integer num;//号牌号码
    private String pid;//收费类型id
    private Integer uid;//单位id
    private Integer paynum;//收费次数
    private Integer sum;//总金额

    private List<Paytype> list;//收费类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumtype() {
        return numtype;
    }

    public void setNumtype(String numtype) {
        this.numtype = numtype;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPaynum() {
        return paynum;
    }

    public void setPaynum(Integer paynum) {
        this.paynum = paynum;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public List<Paytype> getList() {
        return list;
    }

    public void setList(List<Paytype> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", numtype='" + numtype + '\'' +
                ", num=" + num +
                ", pid=" + pid +
                ", uid=" + uid +
                ", paynum=" + paynum +
                ", sum=" + sum +
                ", list=" + list +
                '}';
    }
}
