package com.nostra.pizza.nostrapizza.modelo.servicios.administrador;

import com.nostra.pizza.nostrapizza.modelo.dao.administrador.IAdministradorDao;
import com.nostra.pizza.nostrapizza.modelo.dao.cliente.IClienteDao;
import com.nostra.pizza.nostrapizza.modelo.entidad.Administrador;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AdministradorServiceImpl implements IAdministradorService{

    @Autowired
    private IAdministradorDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Administrador> findAll() {
        return (List<Administrador>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Administrador findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Administrador save(Administrador administrador) {
        return dao.save(administrador);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
