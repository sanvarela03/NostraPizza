package com.nostra.pizza.nostrapizza.modelo.dao.tipoDeProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeProducto;
import org.springframework.data.repository.CrudRepository;

public interface ITipoDeProductoDao extends CrudRepository<TipoDeProducto, Long> {
}
