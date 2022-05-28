package com.nostra.pizza.nostrapizza.modelo.servicios.pedidoProducto;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.pedidoProducto.IPedidoProductoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoProductoServiceImpl implements IPedidoProductoService {
    @Autowired
    private IPedidoProductoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<PedidoProducto> findAll() {
        return (List<PedidoProducto>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PedidoProducto findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public PedidoProducto save(PedidoProducto pedidoProducto) {
        return dao.save(pedidoProducto);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
