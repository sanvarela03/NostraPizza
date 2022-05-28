package com.nostra.pizza.nostrapizza.modelo.servicios.pedido;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.pedido.IPedidoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidoService {
    @Autowired
    private IPedidoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> findAll() {
        return (List<Pedido>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Pedido save(Pedido pedido) {
        return dao.save(pedido);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
