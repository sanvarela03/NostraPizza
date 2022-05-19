package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Sucursal {

    @Id
    private Long id;
    private String nombre;
    private Long costoEnvioKM;


    @OneToMany(mappedBy = "sucursal")
    private List<Pedido> pedidos;

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

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
