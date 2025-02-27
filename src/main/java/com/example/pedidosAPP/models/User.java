package com.example.pedidosAPP.models;

import com.example.pedidosAPP.helpers.enums.UsuarioEnum;
import jakarta.persistence.*;

@Entity
@Table(name ="usuario_tabla")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;
    @Column(name = "nombre", length = 100, unique = true, nullable = false)
    private String name;
    private String email;
    private String password;
    private String phone;
    private UsuarioEnum tipoUsario;

    public User() {
    }

    public User(Integer id, String name, String email, String password, String phone, UsuarioEnum tipoUsario) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.tipoUsario = tipoUsario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UsuarioEnum getTipoUsario() {
        return tipoUsario;
    }

    public void setTipoUsario(UsuarioEnum tipoUsario) {
        this.tipoUsario = tipoUsario;
    }
}
