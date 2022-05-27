package com.nostra.pizza.nostrapizza.modelo.dao.metodoDePago;

import com.nostra.pizza.nostrapizza.modelo.entidad.MetodoDePago;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IMetodoDePagoDao extends CrudRepository<MetodoDePago, Long> {
}
