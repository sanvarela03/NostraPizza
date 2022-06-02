package com.nostra.pizza.nostrapizza.modelo.servicios.administrador;

import com.nostra.pizza.nostrapizza.modelo.entidad.Administrador;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAdministradorService {

    public List<Administrador> findAll();

    public Administrador findById(Long id);

    public Administrador save(Administrador administrador);

    public void delete(Long id);

    public Administrador findByUserAndPass(String username, String password);
}
