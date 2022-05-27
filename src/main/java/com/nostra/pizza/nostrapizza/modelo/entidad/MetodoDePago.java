package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "METODO_DE_PAGO")
public class MetodoDePago {

    @Id
    @Column(name = "METODO_DE_PAGO_ID")
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "metodoDePago")
    private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long metodoPagoID) {
        this.id = metodoPagoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
