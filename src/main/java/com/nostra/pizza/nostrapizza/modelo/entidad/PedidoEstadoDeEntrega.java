package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pedidos_estados_de_entrega")
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

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
