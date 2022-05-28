package com.nostra.pizza.nostrapizza.controladores.tipoDeVehiculo;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeVehiculo;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeVehiculo.ITipoDeVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class TipoDeVehiculoRestController {
    //SERVICIOS
    @Autowired
    private ITipoDeVehiculoService tipoDeVehiculoService;

    //END POINTS
    @GetMapping("/tiposDeVehiculos")
    public List<TipoDeVehiculo> showAll() {
        return tipoDeVehiculoService.findAll();
    }

    @GetMapping("/tiposDeVehiculos/{id}")
    public TipoDeVehiculo show(@PathVariable Long id) {
        return tipoDeVehiculoService.findById(id);
    }

    @PostMapping("/tiposDeVehiculos")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDeVehiculo create(@RequestBody TipoDeVehiculo tipoDeVehiculo) {
        return tipoDeVehiculoService.save(tipoDeVehiculo);
    }

    @PutMapping("/tiposDeVehiculos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDeVehiculo update(@RequestBody TipoDeVehiculo tipoDeVehiculo, @PathVariable Long id) {

        TipoDeVehiculo tipoDeVehiculoActual = tipoDeVehiculoService.findById(id);

        return tipoDeVehiculoService.save(tipoDeVehiculoActual);
    }

    @DeleteMapping("/tiposDeVehiculos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        tipoDeVehiculoService.delete(id);
    }

}

