package com.nostra.pizza.nostrapizza.modelo.entidad;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TIPOS_DE_PRODUCTOS")
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TipoDeProducto {
    //ATRIBUTOS
    @Id
    @Column(name = "TIPO_DE_PRODUCTO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    //RELACIONES
    //@JsonManagedReference
    @OneToMany(mappedBy = "tipoDeProducto")
    private List<Producto> productos = new ArrayList<>();
}
