package com.nostra.pizza.nostrapizza.modelo.dao;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDAO extends CrudRepository<Producto, Long> {

}
