/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data //crea get y set automaticamente
@Entity
@Table(name = "producto")

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private String rutaImagen;
    private int existencias;
    private boolean activo;
    private Long idCategoria;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, String rutaImagen, int existencias, boolean activo, Long idCategoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.existencias = existencias;
        this.activo = activo;
        this.idCategoria = idCategoria;
    }

}


