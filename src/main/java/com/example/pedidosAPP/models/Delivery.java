package com.example.pedidosAPP.models;

import com.example.pedidosAPP.helpers.enums.DeliveryEnum;

import java.time.Instant;

public class Delivery {
    private int id_delivery;
    private Instant fecha_entrega;

    private DeliveryEnum estado_de_entrega;

    public Delivery() {
    }

    public Delivery(int id_delivery, Instant fecha_entrega, DeliveryEnum estado_de_entrega) {
        this.id_delivery = id_delivery;
        this.fecha_entrega = fecha_entrega;
        this.estado_de_entrega = estado_de_entrega;
    }

    public int getId_delivery() {
        return id_delivery;
    }

    public void setId_delivery(int id_delivery) {
        this.id_delivery = id_delivery;
    }

    public Instant getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Instant fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public DeliveryEnum getEstado_de_entrega() {
        return estado_de_entrega;
    }

    public void setEstado_de_entrega(DeliveryEnum estado_de_entrega) {
        this.estado_de_entrega = estado_de_entrega;
    }
}
