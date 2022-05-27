package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    //ATRIBUTOS
    @Id
    @Column(name = "vehiculo_id")
    private Long id;
    private String descripcion;

    //RELACIONES
    @ManyToOne
    private Domiciliario domiciliario;
    @ManyToOne
    private TipoDeVehiculo tipoDeVehiculo;

    //GET Y SETT
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

    public Domiciliario getDomiciliario() {
        return domiciliario;
    }

    public void setDomiciliario(Domiciliario domiciliario) {
        this.domiciliario = domiciliario;
    }

    public TipoDeVehiculo getTipoVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoVehiculo(TipoDeVehiculo tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
}
