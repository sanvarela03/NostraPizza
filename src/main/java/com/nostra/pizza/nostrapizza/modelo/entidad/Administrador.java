package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administrador {

    @Id
    @Column(name = "administrador_id")
    private Long id;
}
