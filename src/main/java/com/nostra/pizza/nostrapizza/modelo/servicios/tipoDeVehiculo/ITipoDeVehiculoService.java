package com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeVehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeVehiculo;

import java.util.List;

public interface ITipoDeVehiculoService {
    public List<TipoDeVehiculo> findAll();

    public TipoDeVehiculo findById(Long id);

    public TipoDeVehiculo save(TipoDeVehiculo tipoDeVehiculo);

    public void delete(Long id);
}
