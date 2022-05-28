package com.nostra.pizza.nostrapizza.modelo.servicios.pedido;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Pedido;

import java.util.List;

public interface IPedidoService {
    public List<Pedido> findAll();

    public Pedido findById(Long id);

    public Pedido save(Pedido pedido);

    public void delete(Long id);
}
