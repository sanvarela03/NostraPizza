package com.nostra.pizza.nostrapizza.controladores.pedidoProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.PedidoProducto;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.pedidoProducto.IPedidoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class PedidoProductoRestController {
    //SERVICIOS
    @Autowired
    private IPedidoProductoService pedidoProductoService;

    //END POINTS
    @GetMapping("/pedidosProductos")
    public List<PedidoProducto> showAll() {
        return pedidoProductoService.findAll();
    }

    @GetMapping("/pedidosProductos/{id}")
    public PedidoProducto show(@PathVariable Long id) {
        return pedidoProductoService.findById(id);
    }

    @PostMapping("/pedidosProductos")
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoProducto create(@RequestBody PedidoProducto pedidoProducto) {
        return pedidoProductoService.save(pedidoProducto);
    }

    @PutMapping("/pedidosProductos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PedidoProducto update(@RequestBody PedidoProducto pedidoProducto, @PathVariable Long id) {

        PedidoProducto pedidoProductoActual = pedidoProductoService.findById(id);

        return pedidoProductoService.save(pedidoProductoActual);
    }

    @DeleteMapping("/pedidosProductos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        pedidoProductoService.delete(id);
    }

}

