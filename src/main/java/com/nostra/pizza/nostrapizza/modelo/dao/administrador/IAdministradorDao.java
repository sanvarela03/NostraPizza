package com.nostra.pizza.nostrapizza.modelo.dao.administrador;

import com.nostra.pizza.nostrapizza.modelo.entidad.Administrador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IAdministradorDao extends CrudRepository<Administrador, Long> {
    @Query(value = "SELECT * From administradores WHERE username = ?1 AND password = ?2", nativeQuery = true)
    Administrador findByUserAndPass(String username, String password);
}
