package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.dto.ScoreRequest;
import com.usa.app.g24.rentas.model.Reservation;
import com.usa.app.g24.rentas.model.Score;
import com.usa.app.g24.rentas.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private ReservationService reservationService;

    public void guardar(ScoreRequest request) throws Exception{
        Reservation reservation = reservationService.getById(request.getReservation().getIdReservation());

        Score score = new Score(null, request.getStars(), request.getMessageText(),
                reservation);
    }

    public List<Score> score(){
        return (List) scoreRepository.findAll();
    }

    public void eliminar(Integer id) throws Exception {
        Score score = scorePorId(id);
        if (score == null) {
            throw new Exception ("La calificación no existe");
        }
        this.scoreRepository.delete(score);
    }

    public void actualizar(ScoreRequest request) throws Exception {
        Score score = scorePorId(request.getIdScore());
        if (score == null) {
            throw new Exception ("La calificación no existe");
        }

        score.setMessageText(request.getMessageText());
        score.setStars(request.getStars());

        scoreRepository.save(score);
    }

    public Score scorePorId (Integer id){
        return this.scoreRepository.findById(id).orElse(null);
    }
}
