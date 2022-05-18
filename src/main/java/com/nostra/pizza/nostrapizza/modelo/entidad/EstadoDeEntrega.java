package com.nostra.pizza.nostrapizza.modelo.entidad;

import com.nostra.pizza.nostrapizza.modelo.entidad.enums.EstadoEntrega;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EstadoDeEntrega {

    @Id
    private Long id;

    private EstadoEntrega estadoEntrega;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoEntrega getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(EstadoEntrega estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }
}
