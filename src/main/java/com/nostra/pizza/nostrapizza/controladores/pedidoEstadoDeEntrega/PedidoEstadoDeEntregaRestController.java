package com.nostra.pizza.nostrapizza.controladores.pedidoEstadoDeEntrega;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoEstadoDeEntrega;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.pedidoEstadoDeEntrega.IPedidoEstadoDeEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class PedidoEstadoDeEntregaRestController {
    //SERVICIOS
    @Autowired
    private IPedidoEstadoDeEntregaService pedidoEstadoDeEntregaService;

    //END POINTS
    @GetMapping("/pedidosEstadosDeEntrega")
    public List<PedidoEstadoDeEntrega> showAll() {
        return pedidoEstadoDeEntregaService.findAll();
    }

    @GetMapping("/pedidosEstadosDeEntrega/{id}")
    public PedidoEstadoDeEntrega show(@PathVariable Long id) {
        return pedidoEstadoDeEntregaService.findById(id);
    }

    @PostMapping("/pedidosEstadosDeEntrega")
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoEstadoDeEntrega create(@RequestBody PedidoEstadoDeEntrega pedidoEstadoDeEntrega) {
        return pedidoEstadoDeEntregaService.save(pedidoEstadoDeEntrega);
    }

    @PutMapping("/pedidosEstadosDeEntrega/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoEstadoDeEntrega update(@RequestBody PedidoEstadoDeEntrega pedidoEstadoDeEntrega, @PathVariable Long id) {

        PedidoEstadoDeEntrega pedidoEstadoDeEntregaActual = pedidoEstadoDeEntregaService.findById(id);


        return pedidoEstadoDeEntregaService.save(pedidoEstadoDeEntregaActual);
    }

    @DeleteMapping("/pedidosEstadosDeEntrega/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        pedidoEstadoDeEntregaService.delete(id);
    }

}

