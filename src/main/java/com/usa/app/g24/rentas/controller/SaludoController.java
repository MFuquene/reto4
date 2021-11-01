/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.app.g24.rentas.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fuken404
 */
@RestController
@RequestMapping("saludo")
public class SaludoController {
    @Value("${message.hola:hola}")
     String mensaje;
    @GetMapping("hola")
    public String saludar(){
        return "<h1>Hola Mundo, "+ mensaje + "</h1>";
    }
}
