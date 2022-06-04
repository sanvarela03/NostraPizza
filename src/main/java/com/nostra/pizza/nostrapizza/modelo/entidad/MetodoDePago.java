package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "metodos_de_pago")
@Getter
@Setter
public class MetodoDePago {
    //ATRIBUTOS
    @Id
    @Column(name = "metodo_de_pago_id")
    private Long id;
    private String nombre;

    //RELACIONES
    @OneToMany(mappedBy = "metodoDePago")
    private List<Pedido> pedidos;
}
