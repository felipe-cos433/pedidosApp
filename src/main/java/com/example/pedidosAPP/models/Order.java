package com.example.pedidosAPP.models;

import com.example.pedidosAPP.helpers.enums.OrderEnum;

import java.time.Instant;

public class Order {
    private int id_pedido;
    private OrderEnum estado;
    private Instant fecha_pedido;
    private double decimal;

    public Order() {
    }

    public Order(int id_pedido, OrderEnum estado, Instant fecha_pedido, double decimal) {
        this.id_pedido = id_pedido;
        this.estado = estado;
        this.fecha_pedido = fecha_pedido;
        this.decimal = decimal;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public OrderEnum getEstado() {
        return estado;
    }

    public void setEstado(OrderEnum estado) {
        this.estado = estado;
    }

    public Instant getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Instant fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
}
