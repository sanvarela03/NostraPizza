package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoVehiculo {
    @Id
    private Long id;

    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
