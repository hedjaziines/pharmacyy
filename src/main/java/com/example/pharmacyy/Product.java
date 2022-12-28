package com.example.pharmacyy;

import java.util.Date;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Date EXP;
    private Integer Qte;
    private String company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice(double price) {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEXP() {
        return EXP;
    }

    public void setEXP(Date EXP) {
        this.EXP = EXP;
    }

    public Integer getQte() {
        return Qte;
    }

    public void setQte(Integer qte) {
        Qte = qte;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
