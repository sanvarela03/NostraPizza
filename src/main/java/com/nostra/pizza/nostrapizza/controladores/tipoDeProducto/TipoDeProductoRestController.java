package com.nostra.pizza.nostrapizza.controladores.tipoDeProducto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeProducto;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeProducto.ITipoDeProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class TipoDeProductoRestController {
    //SERVICIOS
    @Autowired
    private ITipoDeProductoService tipoDeProductoService;

    //END POINTS
    @GetMapping("/tiposDeProductos")
    public List<TipoDeProducto> showAll() {
        return tipoDeProductoService.findAll();
    }

    @GetMapping("/tiposDeProductos/{id}")
    public TipoDeProducto show(@PathVariable Long id) {
        return tipoDeProductoService.findById(id);
    }

    @PostMapping("/tiposDeProductos")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDeProducto create(@RequestBody TipoDeProducto tipoDeProducto) {
        return tipoDeProductoService.save(tipoDeProducto);
    }

    @PutMapping("/tiposDeProductos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDeProducto update(@RequestBody TipoDeProducto tipoDeProducto, @PathVariable Long id) {

        TipoDeProducto tipoDeProductoActual = tipoDeProductoService.findById(id);


        return tipoDeProductoService.save(tipoDeProductoActual);
    }

    @DeleteMapping("/tiposDeProductos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        tipoDeProductoService.delete(id);
    }

}

