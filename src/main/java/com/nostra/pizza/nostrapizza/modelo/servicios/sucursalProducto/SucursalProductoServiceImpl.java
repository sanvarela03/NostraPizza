package com.nostra.pizza.nostrapizza.modelo.servicios.sucursalProducto;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.sucursalProducto.ISucursalProductoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.SucursalProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SucursalProductoServiceImpl implements ISucursalProductoService {
    @Autowired
    private ISucursalProductoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<SucursalProducto> findAll() {
        return (List<SucursalProducto>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public SucursalProducto findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public SucursalProducto save(SucursalProducto sucursalProducto) {
        return dao.save(sucursalProducto);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
