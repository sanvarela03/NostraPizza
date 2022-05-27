package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;

@Entity
@Table(name = "sucursales_productos")
public class SucursalProducto {
    //ATRIBUTOS
    @Id
    @Column(name = "sucursal_producto_id")
    private Long id;
    private boolean estaDisponible;

    //RELACIONES
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "producto_id")
    private Producto producto;

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
