package com.nostra.pizza.nostrapizza.modelo.servicios.pedidoDomiciliario;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.pedidoDomiciliario.IPedidoDomiciliarioDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoDomiciliario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoDomiciliarioServiceImpl implements IPedidoDomiciliarioService {
    @Autowired
    private IPedidoDomiciliarioDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<PedidoDomiciliario> findAll() {
        return (List<PedidoDomiciliario>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PedidoDomiciliario findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public PedidoDomiciliario save(PedidoDomiciliario pedidoDomiciliario) {
        return dao.save(pedidoDomiciliario);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
