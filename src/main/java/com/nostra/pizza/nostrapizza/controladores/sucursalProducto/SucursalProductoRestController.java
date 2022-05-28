package com.nostra.pizza.nostrapizza.controladores.sucursalProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.SucursalProducto;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.sucursalProducto.ISucursalProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class SucursalProductoRestController {
    //SERVICIOS
    @Autowired
    private ISucursalProductoService sucursalProductoService;

    //END POINTS
    @GetMapping("/sucursalesProductos")
    public List<SucursalProducto> showAll() {
        return sucursalProductoService.findAll();
    }

    @GetMapping("/sucursalesProductos/{id}")
    public SucursalProducto show(@PathVariable Long id) {
        return sucursalProductoService.findById(id);
    }

    @PostMapping("/sucursalesProductos")
    @ResponseStatus(HttpStatus.CREATED)
    public SucursalProducto create(@RequestBody SucursalProducto sucursalProducto) {
        return sucursalProductoService.save(sucursalProducto);
    }

    @PutMapping("/sucursalesProductos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public SucursalProducto update(@RequestBody SucursalProducto sucursalProducto, @PathVariable Long id) {

        SucursalProducto sucursalProductoActual = sucursalProductoService.findById(id);


        return sucursalProductoService.save(sucursalProductoActual);
    }

    @DeleteMapping("/sucursalesProductos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        sucursalProductoService.delete(id);
    }

}

