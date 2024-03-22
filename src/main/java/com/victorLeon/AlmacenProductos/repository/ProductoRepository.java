package com.victorLeon.AlmacenProductos.repository;

import com.victorLeon.AlmacenProductos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
