package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.CarRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.service.CarService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Car")
public class CarController implements Serializable {

    @Autowired
    private CarService carService;

    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody CarRequest request){
        try {
            carService.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("all")
    public List<Car> listaDeCarros(){
        return  carService.car();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            carService.eliminar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> actualizar(@RequestBody CarRequest request){
        try {
            carService.actualizar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
