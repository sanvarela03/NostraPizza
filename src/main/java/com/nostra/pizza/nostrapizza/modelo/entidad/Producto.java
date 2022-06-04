package com.nostra.pizza.nostrapizza.modelo.entidad;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "productos")
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Producto {
    //ATRIBUTOS
    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;

    @Column(name = "tiempo_estimado_de_preparacion")
    private String tiempoEstimadoDePreparacion;

    //RELACIONES
    //@JsonBackReference
    @ManyToOne
    private TipoDeProducto tipoDeProducto;

    @OneToMany(mappedBy = "producto")
    private Set<PedidoProducto> pedidoProductos = new HashSet<PedidoProducto>();

    @OneToMany(mappedBy = "producto")
    private Set<SucursalProducto> sucursalesProductos = new HashSet<SucursalProducto>();

    //METODOS
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", tiempoEstimadoDePreparacion='" + tiempoEstimadoDePreparacion + '\'' +
                ", tipoDeProducto=" + tipoDeProducto +
                ", pedidoProductos=" + pedidoProductos +
                ", sucursalesProductos=" + sucursalesProductos +
                '}';
    }
}
