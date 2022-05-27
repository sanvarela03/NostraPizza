package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estados_de_entregas")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<PedidoEstadoDeEntrega> getPedidoEstadoEntregas() {
        return pedidoEstadoDeEntregases;
    }

    public void setPedidoEstadoEntregas(Set<PedidoEstadoDeEntrega> pedidoEstadoDeEntregases) {
        this.pedidoEstadoDeEntregases = pedidoEstadoDeEntregases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    //METODOS
    @PrePersist
    public void prePersist(){
        fecha = new Date();
        hora = new Date();
    }
}
