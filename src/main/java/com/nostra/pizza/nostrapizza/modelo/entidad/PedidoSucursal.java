package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO_SUCURSAL")
public class PedidoSucursal {

    @Id
    @Column(name = "PEDIDO_SUCURSAL_ID")
    private Long id;


}
