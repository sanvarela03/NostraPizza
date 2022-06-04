package com.nostra.pizza.nostrapizza.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pedidos_estados_de_entrega")
@Getter
@Setter
public class PedidoEstadoDeEntrega implements Serializable {

    //ATRIBUTOS
    @Id
    @Column(name = "pedido_estado_de_entrega_id")
    private Long id;

    //RELACIONES
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "estado_de_entrega_id")
    private EstadoDeEntrega estadoDeEntrega;
}
