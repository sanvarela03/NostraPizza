package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PEDIDOS")
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
