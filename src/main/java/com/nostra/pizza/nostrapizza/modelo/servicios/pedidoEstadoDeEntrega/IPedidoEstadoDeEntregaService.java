package com.nostra.pizza.nostrapizza.modelo.servicios.pedidoEstadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoEstadoDeEntrega;

import java.util.List;

public interface IPedidoEstadoDeEntregaService {
    public List<PedidoEstadoDeEntrega> findAll();

    public PedidoEstadoDeEntrega findById(Long id);

    public PedidoEstadoDeEntrega save(PedidoEstadoDeEntrega estadoDeEntrega);

    public void delete(Long id);
}
