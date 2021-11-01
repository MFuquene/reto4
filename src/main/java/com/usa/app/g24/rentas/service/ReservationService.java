package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ReservationRequest;
import com.usa.app.g24.rentas.model.Car;
import com.usa.app.g24.rentas.model.Client;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CarService carService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ScoreService scoreService;

    public void guardar(ReservationRequest request) throws  Exception{
        Car car = carService.carPorId((request.getCar().getIdCar()));
        Client client = clientService.clientPorId(request.getClient().getIdClient());

        if (car==null){
            throw new Exception("Hace falta el carro");
        }

        Reservation reservation = new Reservation(null,
                request.getStartDate(), request.getDevolutionDate(),
                "created", car, client, null);
        reservationRepository.save(reservation);
    }

    public List<Reservation> reservation(){
        return (List) reservationRepository.findAll();
    }

    public void eliminar(Integer id) throws Exception {
        Reservation reservation = getById(id);
        if (reservation == null) {
            throw new Exception ("La reserva no existe");
        }

        scoreService.eliminar(reservation.getScore().getIdScore());

        this.reservationRepository.delete(reservation);
    }

    public void actualizar(ReservationRequest request) throws Exception {
        Reservation reservation = getById(request.getIdReservation());
        if (reservation == null) {
            throw new Exception ("El elemento no existe");
        }

        reservation.setDevolutionDate(request.getDevolutionDate());
        reservation.setStartDate(request.getStartDate());

        reservationRepository.save(reservation);
    }

    public Reservation getById(Integer id){
        return this.reservationRepository.findById(id).orElse(null);
    }
}
