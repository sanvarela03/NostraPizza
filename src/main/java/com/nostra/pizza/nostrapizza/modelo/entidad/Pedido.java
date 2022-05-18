package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Pedido {

    @Id
    @Column(name = "PEDIDO_ID")
    private Long pedidoID;

    private Date fecha;

    private int calificacion;

    @ManyToOne
    private MetodoDePago metodoDePago;


    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private Set<PedidoDomiciliario> pedidoDomiciliarioList = new HashSet<PedidoDomiciliario>();



    public Set<PedidoDomiciliario> getPedidoDomiciliarioList() {
        return pedidoDomiciliarioList;
    }

    public void setPedidoDomiciliarioList(Set<PedidoDomiciliario> pedidoDomiciliarioList) {
        this.pedidoDomiciliarioList = pedidoDomiciliarioList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }


    public Long getPedidoID() {
        return pedidoID;
    }

    public void setPedidoID(Long id) {
        this.pedidoID = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
