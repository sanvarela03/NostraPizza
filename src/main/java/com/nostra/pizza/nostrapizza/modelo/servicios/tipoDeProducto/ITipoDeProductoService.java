package com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeProducto;

import java.util.List;

public interface ITipoDeProductoService {
    public List<TipoDeProducto> findAll();

    public TipoDeProducto findById(Long id);

    public TipoDeProducto save(TipoDeProducto tipoDeProducto);

    public void delete(Long id);
}
