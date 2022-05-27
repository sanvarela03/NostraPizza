package com.nostra.pizza.nostrapizza.modelo.dao.pedidoProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoProducto;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoProductoDao extends CrudRepository<PedidoProducto, Long> {
}
