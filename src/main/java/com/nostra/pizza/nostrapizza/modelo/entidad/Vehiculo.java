package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehiculo {

    @Id
    private Long id;

    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
