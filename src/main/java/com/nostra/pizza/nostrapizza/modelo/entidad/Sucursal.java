package com.nostra.pizza.nostrapizza.modelo.entidad;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "sucursales")
public class Sucursal {

    //ATRIBUTOS
    @Id
    @Column(name = "sucursal_id")
    private Long id;
    private String nombre;
    private Long costoEnvioKM;
    private String horaDeApertura;
    private String horaDeCierre;

    //RELACIONES
    @OneToOne
    private Ubicacion ubicacion;
    @OneToMany(mappedBy = "sucursal")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "sucursal")
    private Set<SucursalProducto> sucursalesProductos = new HashSet<SucursalProducto>();

    // GET Y SET

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

    public String getHoraDeApertura() {
        return horaDeApertura;
    }

    public void setHoraDeApertura(String horaDeApertura) {
        this.horaDeApertura = horaDeApertura;
    }

    public String getHoraDeCierre() {
        return horaDeCierre;
    }

    public void setHoraDeCierre(String horaDeCierre) {
        this.horaDeCierre = horaDeCierre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Set<SucursalProducto> getSucursalesProductos() {
        return sucursalesProductos;
    }

    public void setSucursalesProductos(Set<SucursalProducto> sucursalesProductos) {
        this.sucursalesProductos = sucursalesProductos;
    }
}
