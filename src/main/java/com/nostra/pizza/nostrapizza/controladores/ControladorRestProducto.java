package com.nostra.pizza.nostrapizza.controladores;

import com.nostra.pizza.nostrapizza.modelo.entidad.Producto;
import com.nostra.pizza.nostrapizza.modelo.servicios.producto.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControladorRestProducto {

    @Autowired
    private IProductoService servicioProducto;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return servicioProducto.encontrarTodos();
    }

    @PostMapping("/crearProducto")
    public Producto crearProducto(){
        Producto producto = new Producto();

        return producto;
    }



}
