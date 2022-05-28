package com.nostra.pizza.nostrapizza.modelo.servicios.sucursal;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Sucursal;

import java.util.List;

public interface ISucursalService {
    public List<Sucursal> findAll();

    public Sucursal findById(Long id);

    public Sucursal save(Sucursal sucursal);

    public void delete(Long id);
}
