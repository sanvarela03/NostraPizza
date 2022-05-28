package com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeProducto;

import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.dao.tipoDeProducto.ITipoDeProductoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoDeProductoServiceImpl implements ITipoDeProductoService {
    @Autowired
    private ITipoDeProductoDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<TipoDeProducto> findAll() {
        return (List<TipoDeProducto>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoDeProducto findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoDeProducto save(TipoDeProducto cliente) {
        return dao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
