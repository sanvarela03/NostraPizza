package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sucursal {

    @Id
    private Long id;
    private String nombre;
    private Long costoEnvioKM;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCostoEnvioKM() {
        return costoEnvioKM;
    }

    public void setCostoEnvioKM(Long costoEnvioKM) {
        this.costoEnvioKM = costoEnvioKM;
    }
}
