package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PEDIDO_PRODUCTO")
@Getter
@Setter
public class PedidoProducto {
    //ATRIBUTOS
    @Id
    @Column(name = "PEDIDO_PRODUCTO_ID")
    private Long id;
    private int cantidadProducto;

    //RELACIONES
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PEDIDO_ID")
    private Pedido pedido;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "producto_id")
    private Producto producto;
}

