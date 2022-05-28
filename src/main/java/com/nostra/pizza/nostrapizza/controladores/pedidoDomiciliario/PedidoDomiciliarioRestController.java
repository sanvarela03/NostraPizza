package com.nostra.pizza.nostrapizza.controladores.pedidoDomiciliario;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoDomiciliario;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.pedidoDomiciliario.IPedidoDomiciliarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class PedidoDomiciliarioRestController {
    //SERVICIOS
    @Autowired
    private IPedidoDomiciliarioService pedidoDomiciliarioService;

    //END POINTS
    @GetMapping("/pedidosDomiciliarios")
    public List<PedidoDomiciliario> showAll() {
        return pedidoDomiciliarioService.findAll();
    }

    @GetMapping("/pedidosDomiciliarios/{id}")
    public PedidoDomiciliario show(@PathVariable Long id) {
        return pedidoDomiciliarioService.findById(id);
    }

    @PostMapping("/pedidosDomiciliarios")
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoDomiciliario create(@RequestBody PedidoDomiciliario pedidoDomiciliario) {
        return pedidoDomiciliarioService.save(pedidoDomiciliario);
    }

    @PutMapping("/pedidosDomiciliarios/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoDomiciliario update(@RequestBody PedidoDomiciliario pedidoDomiciliario, @PathVariable Long id) {

        PedidoDomiciliario clienteActual = pedidoDomiciliarioService.findById(id);


        return pedidoDomiciliarioService.save(clienteActual);
    }

    @DeleteMapping("/pedidosDomiciliarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        pedidoDomiciliarioService.delete(id);
    }

}

