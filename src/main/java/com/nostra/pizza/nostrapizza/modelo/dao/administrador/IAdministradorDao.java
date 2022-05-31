package com.nostra.pizza.nostrapizza.modelo.dao.administrador;

import com.nostra.pizza.nostrapizza.modelo.entidad.Administrador;
import org.springframework.data.repository.CrudRepository;

public interface IAdministradorDao extends CrudRepository<Administrador, Long> {
}
