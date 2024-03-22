package com.victorLeon.AlmacenProductos.service;

import com.victorLeon.AlmacenProductos.model.Producto;

import java.util.List;

public interface ProductoService {
    //POST
    public Producto crear_producto(Producto producto);
    //GET-ALL
    public List<Producto> mostrar_productos();
    //GET-BY-ID
    public Producto mostrar_producto_id(Long id) throws Exception;
    //UPDATE
    public Producto actualizar_producto(Long id, Producto producto) throws Exception;
    //DELETE
    public Boolean eliminar_producto(Long id) throws Exception;
}
