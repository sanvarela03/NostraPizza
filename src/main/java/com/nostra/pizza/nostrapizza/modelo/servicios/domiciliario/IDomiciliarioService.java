package com.nostra.pizza.nostrapizza.modelo.servicios.domiciliario;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Domiciliario;

import java.util.List;

public interface IDomiciliarioService {
    public List<Domiciliario> findAll();

    public Domiciliario findById(Long id);

    public Domiciliario save(Domiciliario domiciliario);

    public void delete(Long id);
}
