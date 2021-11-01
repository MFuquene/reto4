package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.ScoreRequest;
import com.usa.app.g24.rentas.model.Score;
import com.usa.app.g24.rentas.repository.ScoreRepository;
import com.usa.app.g24.rentas.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("Score")
public class ScoreController implements Serializable {

    @Autowired
    private ScoreService scoreService;

    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody ScoreRequest request){
        try{
            scoreService.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("all")
    public List<Score> listaDeClasificacionReservas(){
        return (List) scoreService.score();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            scoreService.eliminar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> actualizar(@RequestBody ScoreRequest request) {
        try {
            scoreService.actualizar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
