package com.nostra.pizza.nostrapizza.modelo.dao.domiciliario;

import com.nostra.pizza.nostrapizza.modelo.entidad.Domiciliario;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IDomiciliarioDao extends CrudRepository<Domiciliario, Long> {
}
