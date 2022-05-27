package com.nostra.pizza.nostrapizza.modelo.servicios.estadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.EstadoDeEntrega;

import java.util.List;

public interface IEstadoDeEntregaService {
    public List<EstadoDeEntrega> findAll();

    public EstadoDeEntrega findById(Long id);

    public EstadoDeEntrega save(EstadoDeEntrega estadoDeEntrega);

    public void delete(Long id);
}
