package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estados_de_entregas")
@Getter
@Setter
public class EstadoDeEntrega {

    //RELACIONES
    @Id
    @Column(name = "estado_de_entrega_id")
    private Long id;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.TIME)
    private Date hora;

    //RELACIONES
    @OneToMany(mappedBy = "estadoDeEntrega")
    private Set<PedidoEstadoDeEntrega> pedidoEstadoDeEntregases = new HashSet<PedidoEstadoDeEntrega>();

    //METODOS
    @PrePersist
    public void prePersist(){
        fecha = new Date();
        hora = new Date();
    }
}
