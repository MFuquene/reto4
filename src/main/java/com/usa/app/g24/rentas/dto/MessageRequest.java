package com.usa.app.g24.rentas.dto;

public class MessageRequest {

    private Integer idMessage;
    private  String messageText;
    private Car car;
    private Client client;

    public MessageRequest() {
    }

    public MessageRequest(Integer idMessage, String messageText,
                          Car car, Client client) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.car = car;
        this.client =client;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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

    public class Client{
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
