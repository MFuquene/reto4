package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository <Car, Integer> {
}
