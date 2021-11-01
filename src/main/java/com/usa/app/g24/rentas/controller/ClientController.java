package com.usa.app.g24.rentas.controller;

import com.usa.app.g24.rentas.dto.ClientRequest;
import com.usa.app.g24.rentas.model.Client;
import java.io.Serializable;
import java.util.List;
import com.usa.app.g24.rentas.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Client")
public class ClientController implements Serializable {

    @Autowired
    private ClientService clientService;

    @PostMapping("save")
    public ResponseEntity<?> guardar(@RequestBody ClientRequest request){
        try {
            clientService.guardar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("all")
    public List<Client> listaDeClientes(){
        return clientService.client();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        try {
            clientService.eliminar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("update")
    public ResponseEntity<?> actualizar(@RequestBody  ClientRequest request) {
        try {
            clientService.actualizar(request);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
