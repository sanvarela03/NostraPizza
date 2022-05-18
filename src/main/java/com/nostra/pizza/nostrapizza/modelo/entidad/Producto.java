package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Producto implements Serializable {
    @Id
    @Column(name = "PRODUCTO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private double precio;

    private String descripcion;

    private boolean esVisible;

    @OneToMany(mappedBy = "producto")
    private Set<PedidoProducto> pedidoProductos = new HashSet<PedidoProducto>();

    public Long getId() {
        return id;
    }

    public void setId(Long produtoID) {
        this.id = produtoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsVisible() {
        return esVisible;
    }

    public void setEsVisible(boolean esVisible) {
        this.esVisible = esVisible;
    }

    public Set<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(Set<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }

    /**
     *
     */
    private static final long serialVerionUID = 1L;
}
