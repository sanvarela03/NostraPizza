package com.nostra.pizza.nostrapizza.modelo.dao.sucursalProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.SucursalProducto;
import org.springframework.data.repository.CrudRepository;

public interface ISucursalProductoDao extends CrudRepository<SucursalProducto, Long> {
}
