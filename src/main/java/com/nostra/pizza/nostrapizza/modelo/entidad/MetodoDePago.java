package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class MetodoDePago {

    @Id
    private Long metodoPagoID;

    private String nombre;

    @OneToMany(mappedBy = "metodoDePago")
    private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Long getMetodoPagoID() {
        return metodoPagoID;
    }

    public void setMetodoPagoID(Long metodoPagoID) {
        this.metodoPagoID = metodoPagoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
