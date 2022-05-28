package com.nostra.pizza.nostrapizza.modelo.servicios.ubicacion;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Ubicacion;

import java.util.List;

public interface IUbicacionService {
    public List<Ubicacion> findAll();

    public Ubicacion findById(Long id);

    public Ubicacion save(Ubicacion ubicacion);

    public void delete(Long id);
}
