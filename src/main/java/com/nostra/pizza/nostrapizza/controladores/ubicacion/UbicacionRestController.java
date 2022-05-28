package com.nostra.pizza.nostrapizza.controladores.ubicacion;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Ubicacion;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.ubicacion.IUbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class UbicacionRestController {
    //SERVICIOS
    @Autowired
    private IUbicacionService ubicacionService;

    //END POINTS
    @GetMapping("/ubicaciones")
    public List<Ubicacion> showAll() {
        return ubicacionService.findAll();
    }

    @GetMapping("/ubicaciones/{id}")
    public Ubicacion show(@PathVariable Long id) {
        return ubicacionService.findById(id);
    }

    @PostMapping("/ubicaciones")
    @ResponseStatus(HttpStatus.CREATED)
    public Ubicacion create(@RequestBody Ubicacion ubicacion) {
        return ubicacionService.save(ubicacion);
    }

    @PutMapping("/ubicaciones/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Ubicacion update(@RequestBody Ubicacion ubicacion, @PathVariable Long id) {

        Ubicacion ubicacioActual = ubicacionService.findById(id);


        return ubicacionService.save(ubicacioActual);
    }

    @DeleteMapping("/ubicaciones/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        ubicacionService.delete(id);
    }

}

