package com.nostra.pizza.nostrapizza.modelo.dao.ubicacion;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.Ubicacion;
import org.springframework.data.repository.CrudRepository;

public interface IUbicacionDao extends CrudRepository<Ubicacion, Long> {
}
