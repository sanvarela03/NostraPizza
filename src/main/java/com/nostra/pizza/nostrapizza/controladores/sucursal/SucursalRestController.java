package com.nostra.pizza.nostrapizza.controladores.sucursal;

import com.nostra.pizza.nostrapizza.modelo.entidad.Cliente;
import com.nostra.pizza.nostrapizza.modelo.entidad.Sucursal;
import com.nostra.pizza.nostrapizza.modelo.entidad.Ubicacion;
import com.nostra.pizza.nostrapizza.modelo.servicios.cliente.IClienteService;
import com.nostra.pizza.nostrapizza.modelo.servicios.sucursal.ISucursalService;
import com.nostra.pizza.nostrapizza.modelo.servicios.ubicacion.IUbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class SucursalRestController {
    //SERVICIOS
    @Autowired
    private ISucursalService sucursalService;

    @Autowired
    private IUbicacionService ubicacionService;

    //END POINTS
    @GetMapping("/sucursales")
    public List<Sucursal> showAll() {
        return sucursalService.findAll();
    }

    @GetMapping("/sucursales/{id}")
    public Sucursal show(@PathVariable Long id) {
        return sucursalService.findById(id);
    }

    @PostMapping("/sucursales")
    @ResponseStatus(HttpStatus.CREATED)
    public Sucursal create(@RequestBody Sucursal sucursal) {

        Ubicacion nuevaUbicacion = ubicacionService.save(sucursal.getUbicacion());

        sucursal.setUbicacion(nuevaUbicacion);

        return sucursalService.save(sucursal);
    }

    @PutMapping("/sucursales/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Sucursal update(@RequestBody Sucursal sucursal, @PathVariable Long id) {

        Sucursal sucursalActual = sucursalService.findById(id);

        sucursalActual.setNombre(sucursal.getNombre());
        sucursalActual.setHoraDeApertura(sucursal.getHoraDeApertura());
        sucursalActual.setHoraDeCierre(sucursal.getHoraDeCierre());
        sucursalActual.setCostoEnvioKM(sucursal.getCostoEnvioKM());
        sucursalActual.setIsOpen(sucursal.getIsOpen());

        System.out.println(sucursal.getUbicacion().toString());

        if (ubicacionService.findById(sucursal.getUbicacion().getId()) == null) {
            Ubicacion ubicacionNueva = ubicacionService.save(sucursal.getUbicacion());
            sucursalActual.setUbicacion(ubicacionNueva);
        } else {
            Ubicacion ubicacionActual = ubicacionService.findById(sucursal.getUbicacion().getId());
            ubicacionActual.setCiudad(sucursal.getUbicacion().getCiudad());
            ubicacionActual.setLocalidad(sucursal.getUbicacion().getLocalidad());
            ubicacionActual.setDireccion(sucursal.getUbicacion().getDireccion());
            ubicacionService.save(ubicacionActual);
            sucursalActual.setUbicacion(ubicacionActual);
        }

        return sucursalService.save(sucursalActual);
    }

    @DeleteMapping("/sucursales/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        sucursalService.delete(id);
    }

}

