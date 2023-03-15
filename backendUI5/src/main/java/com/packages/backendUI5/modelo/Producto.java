package com.packages.backendUI5.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="precio")
    private int precio;

    @Column(name="stock")
    private int stock;


    public long getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }



    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }



}
