package com.nostra.pizza.nostrapizza.controladores.estadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.EstadoDeEntrega;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.estadoDeEntrega.IEstadoDeEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class EstadoDeEntregaRestController {
    //SERVICIOS
    @Autowired
    private IEstadoDeEntregaService estadoDeEntregaService;

    //END POINTS
    @GetMapping("/estadosDeEntregas")
    public List<EstadoDeEntrega> showAll() {
        return estadoDeEntregaService.findAll();
    }

    @GetMapping("/estadosDeEntregas/{id}")
    public EstadoDeEntrega show(@PathVariable Long id) {
        return estadoDeEntregaService.findById(id);
    }

    @PostMapping("/estadosDeEntregas")
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoDeEntrega create(@RequestBody EstadoDeEntrega estadoDeEntrega) {
        return estadoDeEntregaService.save(estadoDeEntrega);
    }

    @PutMapping("/estadosDeEntregas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoDeEntrega update(@RequestBody EstadoDeEntrega estadoDeEntrega, @PathVariable Long id) {

        EstadoDeEntrega estadoDeEntregaActual = estadoDeEntregaService.findById(id);


        return estadoDeEntregaService.save(estadoDeEntregaActual);
    }

    @DeleteMapping("/estadosDeEntregas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        estadoDeEntregaService.delete(id);
    }

}

