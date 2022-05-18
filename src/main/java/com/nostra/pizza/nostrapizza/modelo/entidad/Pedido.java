package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PEDIDOS")
public class Pedido {

    @Id
    @Column(name = "PEDIDO_ID")
    private Long id;

    private Date fecha;

    private int calificacion;


    @OneToMany(mappedBy = "pedido")
    private Set<PedidoDomiciliario> pedidoDomiciliarioList = new HashSet<PedidoDomiciliario>();

    @OneToMany(mappedBy = "pedido")
    private Set<PedidoProducto> pedidoProductos = new HashSet<PedidoProducto>();

    public Set<PedidoDomiciliario> getPedidoDomiciliarioList() {
        return pedidoDomiciliarioList;
    }

    public void setPedidoDomiciliarioList(Set<PedidoDomiciliario> pedidoDomiciliarioList) {
        this.pedidoDomiciliarioList = pedidoDomiciliarioList;
    }

    @ManyToOne
    private MetodoDePago metodoDePago;

    @ManyToOne
    private Cliente cliente;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(Set<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }
}
