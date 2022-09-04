package com.example.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public class Product {

    private Integer pid;
    private String pname;  //产品名称
    private String pdesc;  // 产品属性描述
    private String type;   //品类
    private String brand; //品牌
    private Integer available; //库存
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date pdate;  //进货日期
    private String manual; //操作手册

    public Product() {
    }

    public Product(Integer pid, String pname, String pdesc, String type, String brand, Integer available, Date pdate, String manual) {
        this.pid = pid;
        this.pname = pname;
        this.pdesc = pdesc;
        this.type = type;
        this.brand = brand;
        this.available = available;
        this.pdate = pdate;
        this.manual = manual;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    @Override
    public String toString() {
        return "product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pdesc='" + pdesc + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", available='" + available + '\'' +
                ", pdate='" + pdate + '\'' +
                ", manual='" + manual + '\'' +
                '}';
    }
}
