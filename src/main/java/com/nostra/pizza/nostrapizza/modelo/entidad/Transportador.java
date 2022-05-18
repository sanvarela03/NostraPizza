package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transportador {
    @Id
    private Long id;

    private String nombre;

    private  String celular;

    private Long cantidadPedidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Long getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(Long cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }
}
