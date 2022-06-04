package com.nostra.pizza.nostrapizza.modelo.entidad;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "administradores")
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Administrador {

    //ATRIBUTOS
    @Id
    @Column(name = "administrador_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String username;
    String password;

    //RELACIONES
    @ManyToOne
    private Sucursal sucursal;

    //METODOS
    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sucursal=" + sucursal +
                '}';
    }
}
