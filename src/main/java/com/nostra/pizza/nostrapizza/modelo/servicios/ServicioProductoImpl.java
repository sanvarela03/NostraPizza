package com.nostra.pizza.nostrapizza.modelo.servicios;

import com.nostra.pizza.nostrapizza.modelo.dao.IProductoDAO;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class  ServicioProductoImpl implements IServicioProducto {
    @Autowired
    private IProductoDAO dao;

    @Override
    public List<Producto> encontrarTodos() {
        return (List<Producto>) dao.findAll();
    }
}
