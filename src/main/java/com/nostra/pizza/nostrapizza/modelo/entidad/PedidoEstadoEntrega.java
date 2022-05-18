package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PEDIDO_ESTADO_ENTREGA")
public class PedidoEstadoEntrega implements Serializable {
    @Id
    @Column(name = "PEDIDO_ESTADO_ENTREGA_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "ESTADO_ENTREGA_ID")
    private EstadoDeEntrega estadoDeEntrega;


    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public EstadoDeEntrega getEstadoDeEntrega() {
        return estadoDeEntrega;
    }

    public void setEstadoDeEntrega(EstadoDeEntrega estadoDeEntrega) {
        this.estadoDeEntrega = estadoDeEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
