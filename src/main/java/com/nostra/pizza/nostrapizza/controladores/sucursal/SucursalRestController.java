package com.nostra.pizza.nostrapizza.controladores.sucursal;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Sucursal;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.sucursal.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class SucursalRestController {
    //SERVICIOS
    @Autowired
    private ISucursalService sucursalService;

    //END POINTS
    @GetMapping("/sucursales")
    public List<Sucursal> showAll() {
        return sucursalService.findAll();
    }

    @GetMapping("/sucursales/{id}")
    public Sucursal show(@PathVariable Long id) {
        return sucursalService.findById(id);
    }

    @PostMapping("/sucursales")
    @ResponseStatus(HttpStatus.CREATED)
    public Sucursal create(@RequestBody Sucursal sucursal) {
        return sucursalService.save(sucursal);
    }

    @PutMapping("/sucursales/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Sucursal update(@RequestBody Sucursal sucursal, @PathVariable Long id) {

        Sucursal sucursalActual = sucursalService.findById(id);


        return sucursalService.save(sucursalActual);
    }

    @DeleteMapping("/sucursales/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        sucursalService.delete(id);
    }

}

