package com.nostra.pizza.nostrapizza.modelo.servicios.sucursalProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.SucursalProducto;

import java.util.List;

public interface ISucursalProductoService {
    public List<SucursalProducto> findAll();

    public SucursalProducto findById(Long id);

    public SucursalProducto save(SucursalProducto sucursalProducto);

    public void delete(Long id);
}
