package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sucursales_productos")
@Getter
@Setter
public class SucursalProducto {
    //ATRIBUTOS
    @Id
    @Column(name = "sucursal_producto_id")
    private Long id;
    private boolean estaDisponible;

    //RELACIONES
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "producto_id")
    private Producto producto;
}
