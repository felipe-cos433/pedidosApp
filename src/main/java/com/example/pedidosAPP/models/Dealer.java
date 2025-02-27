package com.example.pedidosAPP.models;

public class Dealer {
    private int id_dealer;

    private String name;

    private String phone;

    private String email;

    private String  vehicle;

    public Dealer() {
    }

    public Dealer(int id_dealer, String name, String phone, String email, String vehicle) {
        this.id_dealer = id_dealer;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.vehicle = vehicle;
    }

    public int getId_dealer() {
        return id_dealer;
    }

    public void setId_dealer(int id_dealer) {
        this.id_dealer = id_dealer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
