package com.nostra.pizza.nostrapizza.modelo.servicios.pedidoDomiciliario;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoDomiciliario;

import java.util.List;

public interface IPedidoDomiciliarioService {
    public List<PedidoDomiciliario> findAll();

    public PedidoDomiciliario findById(Long id);

    public PedidoDomiciliario save(PedidoDomiciliario pedidoDomiciliario);

    public void delete(Long id);
}
