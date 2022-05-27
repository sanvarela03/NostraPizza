package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipos_de_vehiculos")
public class TipoDeVehiculo {
    //ATRIBUTOS
    @Id
    @Column(name = "tipo_de_vehiculo_id")
    private Long id;
    private String tipo;

    //RELACIONES
    @OneToMany(mappedBy = "tipoDeVehiculo")
    private List<Vehiculo> vehiculos;

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
