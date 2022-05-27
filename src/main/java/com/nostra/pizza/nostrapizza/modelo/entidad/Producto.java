package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    //ATRIBUTOS
    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;

    @Column(name = "tiempo_estimado_de_preparacion")
    private double tiempoEstimadoDePreparacion;

    //RELACIONES
    @ManyToOne
    private TipoDeProducto tipoDeProducto;
    @OneToMany(mappedBy = "producto")
    private Set<PedidoProducto> pedidoProductos = new HashSet<PedidoProducto>();
    @OneToMany(mappedBy = "producto")
    private Set<SucursalProducto> sucursalesProductos = new HashSet<SucursalProducto>();

    //GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTiempoEstimadoDePreparacion() {
        return tiempoEstimadoDePreparacion;
    }

    public void setTiempoEstimadoDePreparacion(double tiempoEstimadoDePreparacion) {
        this.tiempoEstimadoDePreparacion = tiempoEstimadoDePreparacion;
    }

    public TipoDeProducto getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(TipoDeProducto tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public Set<PedidoProducto> getPedidoProductos() {
        return pedidoProductos;
    }

    public void setPedidoProductos(Set<PedidoProducto> pedidoProductos) {
        this.pedidoProductos = pedidoProductos;
    }

    public Set<SucursalProducto> getSucursalesProductos() {
        return sucursalesProductos;
    }

    public void setSucursalesProductos(Set<SucursalProducto> sucursalesProductos) {
        this.sucursalesProductos = sucursalesProductos;
    }

    private static final long serialVerionUID = 1L;
}
