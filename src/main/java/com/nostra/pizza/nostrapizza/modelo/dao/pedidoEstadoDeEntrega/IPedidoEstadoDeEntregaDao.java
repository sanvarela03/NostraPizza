package com.nostra.pizza.nostrapizza.modelo.dao.pedidoEstadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoEstadoDeEntrega;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoEstadoDeEntregaDao extends CrudRepository<PedidoEstadoDeEntrega, Long> {
}
