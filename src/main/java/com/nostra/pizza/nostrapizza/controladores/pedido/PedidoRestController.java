package com.nostra.pizza.nostrapizza.controladores.pedido;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Pedido;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.pedido.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class PedidoRestController {
    //SERVICIOS
    @Autowired
    private IPedidoService pedidoService;

    //END POINTS
    @GetMapping("/pedidos")
    public List<Pedido> showAll() {
        return pedidoService.findAll();
    }

    @GetMapping("/pedidos/{id}")
    public Pedido show(@PathVariable Long id) {
        return pedidoService.findById(id);
    }

    @PostMapping("/pedidos")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido create(@RequestBody Pedido pedido) {
        return pedidoService.save(pedido);
    }

    @PutMapping("/pedidos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido update(@RequestBody Pedido pedido, @PathVariable Long id) {

        Pedido pedidoActual = pedidoService.findById(id);


        return pedidoService.save(pedidoActual);
    }

    @DeleteMapping("/pedidos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        pedidoService.delete(id);
    }

}

