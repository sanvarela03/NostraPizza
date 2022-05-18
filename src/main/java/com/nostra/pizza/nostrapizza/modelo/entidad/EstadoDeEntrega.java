package com.nostra.pizza.nostrapizza.modelo.entidad;

import com.nostra.pizza.nostrapizza.modelo.entidad.enums.EstadoEntrega;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class EstadoDeEntrega {

    @Id
    @Column(name = "ESTADO_ENTREGA_ID")
    private Long id;


    @OneToMany(mappedBy = "estadoDeEntrega")
    private Set<PedidoEstadoEntrega> pedidoEstadoEntregas = new HashSet<PedidoEstadoEntrega>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<PedidoEstadoEntrega> getPedidoEstadoEntregas() {
        return pedidoEstadoEntregas;
    }

    public void setPedidoEstadoEntregas(Set<PedidoEstadoEntrega> pedidoEstadoEntregas) {
        this.pedidoEstadoEntregas = pedidoEstadoEntregas;
    }
}
