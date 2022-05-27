package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.*;

@Entity
@Table(name = "pedidos_domiciliarios")
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


    //GET Y SET
    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    public Domiciliario getDomiciliario() {
        return domiciliario;
    }

    public void setDomiciliario(Domiciliario domiciliario) {
        this.domiciliario = domiciliario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
