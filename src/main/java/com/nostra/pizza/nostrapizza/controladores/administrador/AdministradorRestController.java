package com.nostra.pizza.nostrapizza.controladores.administrador;

import com.nostra.pizza.nostrapizza.modelo.entidad.Administrador;
import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.servicios.administrador.IAdministradorService;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AdministradorRestController {

    //SERVICIOS
    @Autowired
    private IAdministradorService administradorService;

    //END POINTS
    @GetMapping("/administradores")
    public List<Administrador> showAll() {
        return administradorService.findAll();
    }

    @GetMapping("/administradores/{id}")
    public Administrador show(@PathVariable Long id) {
        return administradorService.findById(id);
    }

    @PostMapping("/administradores")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador create(@RequestBody Administrador administrador) {
        return administradorService.save(administrador);
    }

    @PutMapping("/administradores/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador update(@RequestBody Administrador administrador, @PathVariable Long id) {

        Administrador administradorActual = administradorService.findById(id);


        return administradorService.save(administradorActual);
    }

    @DeleteMapping("/administradores/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        administradorService.delete(id);
    }
}
