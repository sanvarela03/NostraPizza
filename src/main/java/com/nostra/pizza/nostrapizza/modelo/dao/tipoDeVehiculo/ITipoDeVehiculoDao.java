package com.nostra.pizza.nostrapizza.modelo.dao.tipoDeVehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeVehiculo;
import org.springframework.data.repository.CrudRepository;

public interface ITipoDeVehiculoDao extends CrudRepository<TipoDeVehiculo, Long> {
}
