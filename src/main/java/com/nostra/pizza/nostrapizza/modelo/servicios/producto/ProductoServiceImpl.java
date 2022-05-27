package com.nostra.pizza.nostrapizza.modelo.servicios.producto;

import com.nostra.pizza.nostrapizza.modelo.dao.producto.IProductoDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    private IProductoDao dao;

    @Override
    public List<Producto> encontrarTodos() {
        return (List<Producto>) dao.findAll();
    }
}
