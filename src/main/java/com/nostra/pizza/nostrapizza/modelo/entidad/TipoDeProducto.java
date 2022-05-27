package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TIPOS_DE_PRODUCTOS")
public class TipoDeProducto {
    @Id
    @Column(name = "TIPO_DE_PRODUCTO_ID")
    private Long id;
    private String nombre;

    //RELACIONES
    @OneToMany(mappedBy = "tipoDeProducto")
    private List<Producto> productos;

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

    public void setNombre(String descripcion) {
        this.nombre = descripcion;
    }


    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
