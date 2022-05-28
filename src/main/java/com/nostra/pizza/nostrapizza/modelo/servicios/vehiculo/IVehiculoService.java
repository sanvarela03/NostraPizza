package com.nostra.pizza.nostrapizza.modelo.servicios.vehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    public List<Vehiculo> findAll();

    public Vehiculo findById(Long id);

    public Vehiculo save(Vehiculo vehiculo);

    public void delete(Long id);
}
