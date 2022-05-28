package com.nostra.pizza.nostrapizza.modelo.servicios.pedidoProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoProducto;

import java.util.List;

public interface IPedidoProductoService {
    public List<PedidoProducto> findAll();

    public PedidoProducto findById(Long id);

    public PedidoProducto save(PedidoProducto pedidoProducto);

    public void delete(Long id);
}
