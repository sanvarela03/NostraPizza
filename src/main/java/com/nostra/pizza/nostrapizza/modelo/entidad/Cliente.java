package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
public class Cliente {
    //ATRIBUTOS
    @Id
    @Column(name = "CLIENTE_ID")
    private Long Id;
    private String cedula;
    private String nombres ;
    private String apellidos;
    private String correo;
    private String username;
    private String password;
    private String celular;
    @Column(name ="fecha_de_nacimiento")
    private String fechaDeNacimiento;
    private String genero;

    //RELACIONES
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    @OneToOne
    private Ubicacion ubicacion;
}
