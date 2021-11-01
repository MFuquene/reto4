package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ClientRequest;
import com.usa.app.g24.rentas.model.Client;
import com.usa.app.g24.rentas.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void guardar(ClientRequest request) throws  Exception {

        Client client = new Client(null, request.getEmail(),
                request.getPassword(), request.getName(), request.getAge());
        clientRepository.save(client);
    }

    public List<Client> client(){
        return (List) clientRepository.findAll();
    }

    public Client clientPorId(Integer id){
        return clientRepository.findById(id).orElse(null);
    }

    public void eliminar(Integer id) throws Exception {
        Client client = clientPorId(id);
        if (client == null) {
            throw new Exception ("El cliente no existe");
        }

        if (!client.getMessages().isEmpty() ||
                !client.getReservations().isEmpty()) {
            throw new Exception ("El carro tiene mensajes o reservas relacionadas");
        }

        this.clientRepository.delete(client);
    }

    public void actualizar(ClientRequest request) throws Exception {
        Client client = clientPorID(request.getIdClient());
        if (client == null) {
            throw new Exception ("El cliente no existe");
        }

        client.setAge(request.getAge());
        client.setEmail(request.getEmail());
        client.setName(request.getName());
        client.setPassword(request.getPassword());

        clientRepository.save(client);
    }

    public Client clientPorID(Integer id) {
        return this.clientRepository.findById(id).orElse(null);
    }
}
