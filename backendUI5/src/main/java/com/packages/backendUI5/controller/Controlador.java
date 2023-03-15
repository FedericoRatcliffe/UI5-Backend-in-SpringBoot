package com.packages.backendUI5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packages.backendUI5.modelo.Producto;
import com.packages.backendUI5.service.ProductoService;

//EL CONTROLADOR HACE REFERENCIA AL FRONTEND, BRINDANDO TODO EL SERVICIO QUE NOS SOLICITE
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@RestController
@RequestMapping({"/"})
public class Controlador {


    @Autowired
    ProductoService service;

    @GetMapping(path ={"/"})
    public List<Producto>listar(){
        return service.listar();
    }

    @GetMapping(path ={"/id"})
    public Producto listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }



    
}
