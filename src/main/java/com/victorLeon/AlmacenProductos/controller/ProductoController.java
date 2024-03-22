package com.victorLeon.AlmacenProductos.controller;

import com.victorLeon.AlmacenProductos.model.Producto;
import com.victorLeon.AlmacenProductos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    //POST
    @PostMapping("/producto")
    public Producto crear_producto(@RequestBody Producto producto) {
        return productoService.crear_producto(producto);
    }
    //GET-ALL
    @GetMapping("/productos")
    public List<Producto> mostrar_productos() {
        return productoService.mostrar_productos();
    }
    //GET-BY-ID
    @GetMapping("/producto/{id}")
    public Producto mostrar_producto_id(@PathVariable Long id) throws Exception {
        return productoService.mostrar_producto_id(id);
    }
    //UPDATE
    @PutMapping("/producto/{id}")
    public Producto actualizar_producto(@PathVariable Long id, @RequestBody Producto producto) throws Exception {
        return productoService.actualizar_producto(id, producto);
    }
    //DELETE
    @DeleteMapping("/producto/{id}")
    public Boolean eliminar_producot(@PathVariable Long id) throws Exception {
        return productoService.eliminar_producto(id);
    }
}
