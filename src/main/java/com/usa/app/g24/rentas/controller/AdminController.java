package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.model.Admin;
import com.usa.app.g24.rentas.repository.AdminRepository;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Admin")
public class AdminController implements Serializable {

    @Autowired
    private AdminRepository repositorio;

    @PostMapping("save")
    public void guardar(){

    }

    @GetMapping("all")
    public List<Admin> listaDeAdmin(){
        return (List) repositorio.findAll();
    }
}
