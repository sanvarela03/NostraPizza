package com.nostra.pizza.nostrapizza.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
public class Pedido {
    //ATRIBUTOS
    @Id
    @Column(name = "pedido_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private int calificacion;

    //RELACIONES
    @OneToMany(mappedBy = "pedido")
    private Set<PedidoDomiciliario> pedidoDomiciliarioList = new HashSet<PedidoDomiciliario>();
    @OneToMany(mappedBy = "pedido")
    private Set<PedidoProducto> pedidosProductos = new HashSet<PedidoProducto>();
    @OneToMany(mappedBy = "pedido")
    private Set<PedidoEstadoDeEntrega> pedidosEstadosDeEntregas = new HashSet<PedidoEstadoDeEntrega>();
    @ManyToOne
    private MetodoDePago metodoDePago;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Sucursal sucursal;
}
