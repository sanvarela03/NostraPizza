package com.nostra.pizza.nostrapizza.modelo.dao.pedidoDomiciliario;

import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoDomiciliario;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoDomiciliarioDao extends CrudRepository<PedidoDomiciliario, Long> {
}
