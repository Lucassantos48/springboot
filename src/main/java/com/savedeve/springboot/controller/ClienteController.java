package com.savedeve.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savedeve.springboot.model.Cliente;

@RestController
public class ClienteController {

    @GetMapping(path = "/clientes/qualquer")
    public Cliente obterCliente(){
        return new Cliente(1, "Lucas Marques", "123.456.789-94");
    }
    
}
