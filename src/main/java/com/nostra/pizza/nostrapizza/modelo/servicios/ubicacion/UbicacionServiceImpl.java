package com.nostra.pizza.nostrapizza.modelo.servicios.ubicacion;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.ubicacion.IUbicacionDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UbicacionServiceImpl implements IUbicacionService {
    @Autowired
    private IUbicacionDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Ubicacion> findAll() {
        return (List<Ubicacion>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Ubicacion findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Ubicacion save(Ubicacion ubicacion) {
        return dao.save(ubicacion);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
