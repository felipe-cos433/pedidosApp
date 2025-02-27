package com.example.pedidosAPP.models;

public class Store {

    private String id_store;
    private String name;
    private String address;
    private String phone;
    private String category;

    public Store() {
    }

    public Store(String id_store, String name, String address, String phone, String category) {
        this.id_store = id_store;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
    }

    public String getId_store() {
        return id_store;
    }

    public void setId_store(String id_store) {
        this.id_store = id_store;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
