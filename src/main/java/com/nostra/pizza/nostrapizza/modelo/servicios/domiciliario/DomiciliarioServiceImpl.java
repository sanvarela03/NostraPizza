package com.nostra.pizza.nostrapizza.modelo.servicios.domiciliario;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.domiciliario.IDomiciliarioDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Domiciliario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DomiciliarioServiceImpl implements IDomiciliarioService {
    @Autowired
    private IDomiciliarioDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Domiciliario> findAll() {
        return (List<Domiciliario>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Domiciliario findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Domiciliario save(Domiciliario domiciliario) {
        return dao.save(domiciliario);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
