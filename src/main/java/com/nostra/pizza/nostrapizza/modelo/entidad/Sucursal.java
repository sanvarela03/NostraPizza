package com.nostra.pizza.nostrapizza.modelo.entidad;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "sucursales")
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Sucursal {
    //ATRIBUTOS
    @Id
    @Column(name = "sucursal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Long costoEnvioKM;
    private String horaDeApertura;
    private String horaDeCierre;
    @Column(name = "is_open")
    private Boolean isOpen;

    //RELACIONES
    @OneToOne
    private Ubicacion ubicacion;

    @OneToMany(mappedBy = "sucursal")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "sucursal")
    private Set<SucursalProducto> sucursalesProductos = new HashSet<SucursalProducto>();

    @OneToMany(mappedBy = "sucursal")
    private List<Administrador> administradores = new ArrayList<>();


}
