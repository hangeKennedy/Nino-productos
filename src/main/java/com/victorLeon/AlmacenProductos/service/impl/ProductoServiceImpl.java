package com.victorLeon.AlmacenProductos.service.impl;

import com.victorLeon.AlmacenProductos.model.Producto;
import com.victorLeon.AlmacenProductos.repository.ProductoRepository;
import com.victorLeon.AlmacenProductos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    //POST
    @Override
    public Producto crear_producto(Producto producto) {
        return productoRepository.save(producto);
    }
    //GET-ALL
    @Override
    public List<Producto> mostrar_productos() {
        return productoRepository.findAll();
    }
    //GET-BY-ID
    @Override
    public Producto mostrar_producto_id(Long id) throws Exception{
        Optional<Producto> existe = productoRepository.findById(id);
        if (existe.isPresent())
            return existe.get();
        throw new Exception("No existe esa id: " + id);
    }
    //UPDATE
    @Override
    public Producto actualizar_producto(Long id, Producto producto) throws Exception {
        Producto existe = mostrar_producto_id(id);
        existe.setCodigo(producto.getCodigo());
        existe.setNombre(producto.getNombre());
        existe.setMarca(producto.getMarca());
        existe.setDescripcion(producto.getDescripcion());
        existe.setPrecio(producto.getPrecio());
        existe.setCantidad(producto.getCantidad());
        return productoRepository.save(existe);
    }

    @Override
    public Boolean eliminar_producto(Long id) throws Exception {
        Producto existe = mostrar_producto_id(id);
        if (existe != null) {
            productoRepository.deleteById(id);
            return true;
        }
        return null;
    }
}
