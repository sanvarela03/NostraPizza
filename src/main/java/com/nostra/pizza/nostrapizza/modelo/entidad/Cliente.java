package com.nostra.pizza.nostrapizza.modelo.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    //ATRIBUTOS
    @Id
    @Column(name = "CLIENTE_ID")
    private Long Id;
    private String nombre;
    private String correo;
    private String password;
    private String celular;

    //RELACIONES
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    @OneToOne
    private Ubicacion ubicacion;


    //GET Y SET
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
