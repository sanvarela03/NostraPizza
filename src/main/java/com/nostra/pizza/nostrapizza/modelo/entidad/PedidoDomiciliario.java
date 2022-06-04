package com.nostra.pizza.nostrapizza.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pedidos_domiciliarios")
@Getter
@Setter
public class PedidoDomiciliario {

    //ATRIBUTOS
    @Id
    @Column(name = "pedido_domiciliario_id")
    private Long id;
    private Boolean aceptado;

    //RELACIONES
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domiciliario_id")
    private Domiciliario domiciliario;
}
