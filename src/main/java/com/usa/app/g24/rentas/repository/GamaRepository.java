package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Gama;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamaRepository extends CrudRepository <Gama, Integer>{
    Gama findByName(String name);
}
