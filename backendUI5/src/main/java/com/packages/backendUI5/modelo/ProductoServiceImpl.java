package com.packages.backendUI5.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.backendUI5.service.ProductoRepositorio;
import com.packages.backendUI5.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {


    @Autowired
    private ProductoRepositorio repositorio;


    @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }


    @Override
    public Producto listarId(int id) {
        return repositorio.findById(id);
    }
    
}
