package com.nostra.pizza.nostrapizza.modelo.dao.estadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.entidad.EstadoDeEntrega;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IEstadoDeEntregaDao extends CrudRepository<EstadoDeEntrega, Long> {
}
