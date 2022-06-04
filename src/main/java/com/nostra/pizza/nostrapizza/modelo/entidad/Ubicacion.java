package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ubicaciones")
@Getter
@Setter
public class Ubicacion {
    //ATRIBUTOS
    @Id
    @Column(name = "ubicacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ciudad;
    private String direccion;
    private String localidad;

    //METODOS
    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
