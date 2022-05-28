package com.nostra.pizza.nostrapizza.modelo.servicios.metodoDePago;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.metodoDePago.IMetodoDePagoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.MetodoDePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MetodoDePagoServiceImpl implements IMetodoDePagoService {
    @Autowired
    private IMetodoDePagoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<MetodoDePago> findAll() {
        return (List<MetodoDePago>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public MetodoDePago findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public MetodoDePago save(MetodoDePago metodoDePago) {
        return dao.save(metodoDePago);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
