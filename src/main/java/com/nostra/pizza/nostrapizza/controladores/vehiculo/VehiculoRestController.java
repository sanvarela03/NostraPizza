package com.nostra.pizza.nostrapizza.controladores.vehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Vehiculo;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.vehiculo.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class VehiculoRestController {
    //SERVICIOS
    @Autowired
    private IVehiculoService vehiculoService;

    //END POINTS
    @GetMapping("/vehiculos")
    public List<Vehiculo> showAll() {
        return vehiculoService.findAll();
    }

    @GetMapping("/vehiculos/{id}")
    public Vehiculo show(@PathVariable Long id) {
        return vehiculoService.findById(id);
    }

    @PostMapping("/vehiculos")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo create(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.save(vehiculo);
    }

    @PutMapping("/vehiculos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo update(@RequestBody Vehiculo cliente, @PathVariable Long id) {

        Vehiculo vehiculoActual = vehiculoService.findById(id);


        return vehiculoService.save(vehiculoActual);
    }

    @DeleteMapping("/vehiculos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        vehiculoService.delete(id);
    }

}

