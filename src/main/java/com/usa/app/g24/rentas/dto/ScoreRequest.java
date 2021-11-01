package com.usa.app.g24.rentas.dto;

public class ScoreRequest {

    private  Integer idScore;
    private Integer stars;
    private String messageText;
    private Reservation reservation;

    public ScoreRequest() {
    }

    public ScoreRequest(Integer idScore, Integer stars, String messageText,
                        Reservation reservation) {
        this.stars = stars;
        this.messageText = messageText;
        this.idScore = idScore;
        this.reservation = reservation;
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

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public class Reservation {

        private Integer idReservation;

        public Reservation() {
        }

        public Reservation(Integer idReservation) {
            this.idReservation = idReservation;
        }

        public Integer getIdReservation() {
            return idReservation;
        }

        public void setIdReservation(Integer idReservation) {
            this.idReservation = idReservation;
        }
    }
}
