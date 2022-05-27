package com.nostra.pizza.nostrapizza.modelo.dao.sucursal;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.Sucursal;
import org.springframework.data.repository.CrudRepository;

public interface ISucursalDao extends CrudRepository<Sucursal, Long> {
}
