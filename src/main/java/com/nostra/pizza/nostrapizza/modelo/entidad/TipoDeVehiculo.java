package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipos_de_vehiculos")
@Getter
@Setter
public class TipoDeVehiculo {
    //ATRIBUTOS
    @Id
    @Column(name = "tipo_de_vehiculo_id")
    private Long id;
    private String tipo;

    //RELACIONES
    @OneToMany(mappedBy = "tipoDeVehiculo")
    private List<Vehiculo> vehiculos;
}
