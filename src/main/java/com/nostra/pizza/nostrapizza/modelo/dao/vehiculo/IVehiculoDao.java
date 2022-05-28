package com.nostra.pizza.nostrapizza.modelo.dao.vehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long> {

}
