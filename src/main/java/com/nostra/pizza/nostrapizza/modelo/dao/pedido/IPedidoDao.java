package com.nostra.pizza.nostrapizza.modelo.dao.pedido;

import com.nostra.pizza.nostrapizza.modelo.entidad.Pedido;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoDao extends CrudRepository<Pedido, Long> {
}
