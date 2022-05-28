package com.nostra.pizza.nostrapizza.modelo.servicios.metodoDePago;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.MetodoDePago;

import java.util.List;

public interface IMetodoDePagoService {
    public List<MetodoDePago> findAll();

    public MetodoDePago findById(Long id);

    public MetodoDePago save(MetodoDePago metodoDePago);

    public void delete(Long id);
}
