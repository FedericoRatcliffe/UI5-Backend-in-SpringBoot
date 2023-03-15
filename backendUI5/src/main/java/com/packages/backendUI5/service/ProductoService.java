package com.packages.backendUI5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packages.backendUI5.modelo.Producto;

@Service
public interface ProductoService {
    
    //LISTA DE TIPO PRODUCTO
    List<Producto>listar();

    Producto listarId(int id);


}
