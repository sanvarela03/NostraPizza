package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
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
}
