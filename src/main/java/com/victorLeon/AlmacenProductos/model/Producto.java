package com.victorLeon.AlmacenProductos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;
    private String marca;
    private String descripcion;
    private double precio;
    private int cantidad;
}
