package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Score")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idScore", length = 11, nullable = false)
    private Integer idScore;

    @Column(name = "stars", length = 1, nullable = false)
    private Integer stars;

    @Column(name = "messageText", length = 250, nullable = false)
    private String messageText;

    @OneToOne
    @JoinColumn(name = "idReservation", updatable = false, nullable = false)
    @JsonIgnoreProperties("score")
    private Reservation reservation;

    public Score() {
    }

    public Score(Integer idScore, Integer stars, String messageText) {
        this.idScore = idScore;
        this.stars = stars;
        this.messageText = messageText;
    }

    public Score(Integer idScore, Integer stars, String messageText, Reservation reservation) {
        this.idScore = idScore;
        this.stars = stars;
        this.messageText = messageText;
        this.reservation = reservation;
    }

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
