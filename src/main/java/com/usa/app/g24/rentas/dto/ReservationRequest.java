package com.usa.app.g24.rentas.dto;

import java.util.Date;

public class ReservationRequest {

    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status;
    private Car car;
    private Client client;

    public ReservationRequest() {
    }

    public ReservationRequest(Integer idReservation,
                              Date startDate, Date devolutionDate, String status,
                              Car car, Client client) {
        this.idReservation = idReservation;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
        this.status = status;
        this.car = car;
        this.client = client;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public class Car{
        private Integer idCar;

        public Car() {
        }

        public Car(Integer idCar) {
            this.idCar = idCar;
        }

        public Integer getIdCar() {
            return idCar;
        }

        public void setIdCar(Integer idCar) {
            this.idCar = idCar;
        }
    }

    public class Client {
        private Integer idClient;

        public Client() {
        }

        public Client(Integer idClient) {
            this.idClient = idClient;
        }

        public Integer getIdClient() {
            return idClient;
        }

        public void setIdClient(Integer idClient) {
            this.idClient = idClient;
        }
    }
}
