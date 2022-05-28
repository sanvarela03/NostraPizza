package com.nostra.pizza.nostrapizza.modelo.servicios.vehiculo;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.vehiculo.IVehiculoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
    @Autowired
    private IVehiculoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Vehiculo> findAll() {
        return (List<Vehiculo>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Vehiculo save(Vehiculo vehiculo) {
        return dao.save(vehiculo);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
