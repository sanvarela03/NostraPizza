package com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeVehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente pasajero);

    public void delete(Long id);
}
