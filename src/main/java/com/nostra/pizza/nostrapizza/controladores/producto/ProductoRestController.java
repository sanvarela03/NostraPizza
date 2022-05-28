package com.nostra.pizza.nostrapizza.controladores.producto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.producto.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {
    //SERVICIOS
    @Autowired
    private IProductoService productoService;

    //END POINTS
    @GetMapping("/productos")
    public List<Producto> showAll() {
        return productoService.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto show(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping("/productos")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto, @PathVariable Long id) {

        Producto productoActual = productoService.findById(id);


        return productoService.save(productoActual);
    }

    @DeleteMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }

}

