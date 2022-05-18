package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "DOMICILIARIOS")
public class Domiciliario {
    @Id
    @Column(name = "DOMICILIARIO_ID")
    private Long id;

    private String nombre;

    private String celular;

    private Boolean disponible;

    @OneToMany(mappedBy = "domiciliario")
    private Set<PedidoDomiciliario> pedidoDomiciliarioList = new HashSet<PedidoDomiciliario>();


    public Set<PedidoDomiciliario> getPedidoDomiciliarioList() {
        return pedidoDomiciliarioList;
    }

    public void setPedidoDomiciliarioList(Set<PedidoDomiciliario> pedidoDomiciliarioList) {
        this.pedidoDomiciliarioList = pedidoDomiciliarioList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long idDomiciliario) {
        this.id = idDomiciliario;
    }
}
