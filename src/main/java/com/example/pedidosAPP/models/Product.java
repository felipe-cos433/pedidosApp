package com.example.pedidosAPP.models;

public class Product {
    private int id_product;
    private String name;
    private Double price;
    private String description;

    public Product() {
    }

    public Product(int id_product, String name, Double price, String description) {
        this.id_product = id_product;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
