package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.CarRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private GamaService gamaService;

    public void guardar(CarRequest request) throws Exception {
        Gama gama = gamaService.gamaPorId(request.getGama().getIdGama());

        if (gama == null){
            throw new Exception("Hace falta la Gama");
        }

        Car car = new Car(null, request.getName(), request.getBrand(),
                request.getYear(), request.getDescription(), gama);
        carRepository.save(car);
    }

    public List<Car> car(){
        return (List) carRepository.findAll();
    }

    public void eliminar(Integer id) throws Exception{
        Car car = carPorId(id);
        if (car == null){
            throw new Exception("El carro no existe");
        }

        if (!car.getMessages().isEmpty() || !car.getReservations().isEmpty()){
            throw new Exception("El carro tiene mensajes o reservas relacionadas");
        }

        this.carRepository.delete(car);
    }

    public void actualizar(CarRequest request) throws Exception{
        Car car = carPorId(request.getIdCar());
        if (car == null){
            throw new Exception("El carro no existe");
        }

        car.setName(request.getName());
        car.setBrand(request.getBrand());
        car.setYear(request.getYear());
        car.setDescription(request.getDescription());

        carRepository.save(car);
    }

    public Car carPorId(Integer id){
        return carRepository.findById(id).orElse(null);
    }
}
