package com.nostra.pizza.nostrapizza.modelo.servicios.producto;

import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoProducto;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void delete(Long id);

}
