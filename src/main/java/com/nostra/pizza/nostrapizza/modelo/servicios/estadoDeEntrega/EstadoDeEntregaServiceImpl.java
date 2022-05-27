package com.nostra.pizza.nostrapizza.modelo.servicios.estadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.estadoDeEntrega.IEstadoDeEntregaDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.EstadoDeEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstadoDeEntregaServiceImpl implements IEstadoDeEntregaService {
    @Autowired
    private IEstadoDeEntregaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<EstadoDeEntrega> findAll() {
        return (List<EstadoDeEntrega>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EstadoDeEntrega findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public EstadoDeEntrega save(EstadoDeEntrega estadoDeEntrega) {
        return dao.save(estadoDeEntrega);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
