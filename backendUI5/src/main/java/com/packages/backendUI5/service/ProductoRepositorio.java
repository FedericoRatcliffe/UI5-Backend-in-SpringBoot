package com.packages.backendUI5.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packages.backendUI5.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

    //LISTAR PRODUCTOS
    List<Producto>findAll();

    Producto findById(int id);
}
