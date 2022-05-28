package com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeVehiculo;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.tipoDeVehiculo.ITipoDeVehiculoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoDeVehiculoServiceImpl implements ITipoDeVehiculoService {
    @Autowired
    private ITipoDeVehiculoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<TipoDeVehiculo> findAll() {
        return (List<TipoDeVehiculo>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoDeVehiculo findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoDeVehiculo save(TipoDeVehiculo tipoDeVehiculo) {
        return dao.save(tipoDeVehiculo);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
