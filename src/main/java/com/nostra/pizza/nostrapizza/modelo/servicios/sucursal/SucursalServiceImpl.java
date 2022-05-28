package com.nostra.pizza.nostrapizza.modelo.servicios.sucursal;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.sucursal.ISucursalDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SucursalServiceImpl implements ISucursalService {
    @Autowired
    private ISucursalDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Sucursal> findAll() {
        return (List<Sucursal>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Sucursal findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Sucursal save(Sucursal sucursal) {
        return dao.save(sucursal);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
