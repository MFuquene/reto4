package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.GamaRequest;
import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GamaService {
    @Autowired
    private GamaRepository gamaRepository;

    public void guardar(GamaRequest request) throws Exception {

        if (existeGama(request.getName())){
            throw new Exception("Gama ya existe");
        }
        Gama gama = new Gama(null, request.getName(),
                request.getDescription());
        gamaRepository.save(gama);
    }

    public List<Gama> gama() {
        return (List) gamaRepository.findAll();
    }

    public Gama gamaPorId(Integer id){
        return gamaRepository.findById(id).orElse(null);
    }

    public void eliminar(Integer id) throws Exception {
        Gama gama = gamaPorId(id);
        if (gama == null) {
            throw new Exception ("La gama no existe");
        }

        if (!gama.getCars().isEmpty()) {
            throw new Exception ("La gama tiene carros relacionados");
        }

        gamaRepository.delete(gama);
    }

    public void actualizar(GamaRequest request) throws Exception {
        Gama gama = gamaPorId(request.getIdGama());
        if (gama == null) {
            throw new Exception ("La gama no existe");
        }

        gama.setDescription(request.getDescription());
        gama.setName(request.getName());

        gamaRepository.save(gama);
    }

    private  boolean existeGama(String name){
        Gama  gama = gamaRepository.findByName(name);
        if (gama == null){
            return false;
        } else {
            return true;
        }
    }
}