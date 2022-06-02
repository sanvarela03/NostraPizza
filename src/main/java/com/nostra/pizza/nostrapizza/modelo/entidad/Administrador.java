package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.*;

@Entity
@Table(name = "administradores")
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

    //GET Y SET
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

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
