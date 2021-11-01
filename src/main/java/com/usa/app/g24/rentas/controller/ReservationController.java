package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.ReservationRequest;
import com.usa.app.g24.rentas.model.Reservation;
import java.io.Serializable;
import java.util.List;
import com.usa.app.g24.rentas.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Reservation")
public class ReservationController implements Serializable {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody ReservationRequest request){
        try {
            reservationService.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("all")
    public List<Reservation> listaDeReservas(){
        return  reservationService.reservation();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            reservationService.eliminar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> actualizar(@RequestBody ReservationRequest request) {
        try {
            reservationService.actualizar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
