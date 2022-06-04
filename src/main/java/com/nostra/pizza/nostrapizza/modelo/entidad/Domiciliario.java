package com.nostra.pizza.nostrapizza.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "domiciliarios")
@Getter
@Setter
public class Domiciliario {
    //ATRIBUTOS
    @Id
    @Column(name = "domiciliario_id")
    private Long id;
    private String nombre;
    private String celular;
    private Boolean disponible;

    //RELACIONES
    @OneToMany(mappedBy = "domiciliario")
    private List<Vehiculo> vehiculos;
    @OneToMany(mappedBy = "domiciliario")
    private Set<PedidoDomiciliario> pedidoDomiciliarioList = new HashSet<PedidoDomiciliario>();
}
