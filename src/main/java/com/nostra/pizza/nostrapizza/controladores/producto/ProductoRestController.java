package com.nostra.pizza.nostrapizza.controladores.producto;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.entidad.TipoDeProducto;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.producto.IProductoService;
import com.nostra.pizza.nostrapizza.modelo.servicios.tipoDeProducto.ITipoDeProductoService;
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
    @Autowired
    private ITipoDeProductoService tipoDeProductoService;



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

        TipoDeProducto tipoDeProductoNuevo = tipoDeProductoService.save(producto.getTipoDeProducto());

        tipoDeProductoNuevo.getProductos().add(producto);

        producto.setTipoDeProducto(tipoDeProductoNuevo);

        return productoService.save(producto);
    }

    @PutMapping("/productos/{idProducto}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto, @PathVariable Long idProducto) {

        System.out.println(producto.toString());

//        Producto productoActual = productoService.findById(idProducto);

//        if(tipoDeProductoService.findById(producto.getTipoDeProducto().getId()) == null){
////            TipoDeProducto nuevoTipo = tipoDeProductoService.save(producto.getTipoDeProducto());
////            productoActual.setTipoDeProducto(nuevoTipo);
////        }else {
////            TipoDeProducto tipoActual = tipoDeProductoService.findById(producto.getTipoDeProducto().getId());
////            tipoActual.setNombre(producto.getTipoDeProducto().getNombre());
////            productoActual.setTipoDeProducto(tipoActual);
////        }

//        productoActual.setNombre(producto.getNombre());
//        productoActual.setDescripcion(producto.getDescripcion());
//        productoActual.setPrecio(producto.getPrecio());
//        productoActual.setTiempoEstimadoDePreparacion(producto.getTiempoEstimadoDePreparacion());


        return productoService.save(producto);
    }

    @DeleteMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        productoService.delete(id);
    }

}

