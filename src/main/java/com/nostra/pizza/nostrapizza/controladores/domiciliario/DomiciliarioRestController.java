package com.nostra.pizza.nostrapizza.controladores.domiciliario;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Domiciliario;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.domiciliario.IDomiciliarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class DomiciliarioRestController {
    //SERVICIOS
    @Autowired
    private IDomiciliarioService domiciliarioService;

    //END POINTS
    @GetMapping("/domiciliarios")
    public List<Domiciliario> showAll() {
        return domiciliarioService.findAll();
    }

    @GetMapping("/domiciliarios/{id}")
    public Domiciliario show(@PathVariable Long id) {
        return domiciliarioService.findById(id);
    }

    @PostMapping("/domiciliarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Domiciliario create(@RequestBody Domiciliario domiciliario) {
        return domiciliarioService.save(domiciliario);
    }

    @PutMapping("/domiciliarios/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Domiciliario update(@RequestBody Domiciliario domiciliario, @PathVariable Long id) {

        Domiciliario domiciliarioActual = domiciliarioService.findById(id);



        return domiciliarioService.save(domiciliarioActual);
    }

    @DeleteMapping("/domiciliarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        domiciliarioService.delete(id);
    }

}

