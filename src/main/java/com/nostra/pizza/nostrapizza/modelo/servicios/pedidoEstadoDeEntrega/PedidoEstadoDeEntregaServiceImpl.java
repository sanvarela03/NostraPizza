package com.nostra.pizza.nostrapizza.modelo.servicios.pedidoEstadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.pedidoEstadoDeEntrega.IPedidoEstadoDeEntregaDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoEstadoDeEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoEstadoDeEntregaServiceImpl implements IPedidoEstadoDeEntregaService {
    @Autowired
    private IPedidoEstadoDeEntregaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<PedidoEstadoDeEntrega> findAll() {
        return (List<PedidoEstadoDeEntrega>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PedidoEstadoDeEntrega findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public PedidoEstadoDeEntrega save(PedidoEstadoDeEntrega estadoDeEntrega) {
        return dao.save(estadoDeEntrega);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
