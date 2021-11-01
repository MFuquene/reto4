package com.usa.app.g24.rentas.dto;

public class CarRequest {

    private Integer idCar;
    private String name;
    private String brand;
    private Integer year;
    private String description;
    private Gama gama;
    private Message message;
    private Reservation reservation;

    public CarRequest() {
    }

    public CarRequest(Integer idCar, String name, String brand,
                      Integer year, String description, Gama gama,
                      Message message, Reservation reservation) {
        this.idCar = idCar;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.gama = gama;
        this.message = message;
        this.reservation = reservation;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gama getGama() {
        return gama;
    }

    public void setGama(Gama gama) {
        this.gama = gama;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public class Gama{
        private Integer idGama;

        public Gama() {
        }

        public Gama(Integer idGama) {
            this.idGama = idGama;
        }

        public Integer getIdGama() {
            return idGama;
        }

        public void setIdGama(Integer idGama) {
            this.idGama = idGama;
        }
    }

    public class Message{
        private Integer idMessage;

        public Message() {
        }

        public Message(Integer idMessage) {
            this.idMessage = idMessage;
        }

        public Integer getIdMessage() {
            return idMessage;
        }

        public void setIdMessage(Integer idMessage) {
            this.idMessage = idMessage;
        }
    }

    public class Reservation{
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
