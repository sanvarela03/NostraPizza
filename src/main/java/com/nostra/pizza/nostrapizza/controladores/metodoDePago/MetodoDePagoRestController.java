package com.nostra.pizza.nostrapizza.controladores.metodoDePago;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.MetodoDePago;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.metodoDePago.IMetodoDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class MetodoDePagoRestController {
    //SERVICIOS
    @Autowired
    private IMetodoDePagoService metodoDePagoService;

    //END POINTS
    @GetMapping("/metodosDePago")
    public List<MetodoDePago> showAll() {
        return metodoDePagoService.findAll();
    }

    @GetMapping("/metodosDePago/{id}")
    public MetodoDePago show(@PathVariable Long id) {
        return metodoDePagoService.findById(id);
    }

    @PostMapping("/metodosDePago")
    @ResponseStatus(HttpStatus.CREATED)
    public MetodoDePago create(@RequestBody MetodoDePago metodoDePago) {
        return metodoDePagoService.save(metodoDePago);
    }

    @PutMapping("/metodosDePago/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public MetodoDePago update(@RequestBody MetodoDePago metodoDePago, @PathVariable Long id) {

        MetodoDePago metodoDePagoActual = metodoDePagoService.findById(id);


        return metodoDePagoService.save(metodoDePagoActual);
    }

    @DeleteMapping("/metodosDePago/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        metodoDePagoService.delete(id);
    }

}

