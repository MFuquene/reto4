package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@Table(name = "Message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMessage", length = 11, nullable = false)
    private Integer idMessage;

    @Column(name = "messageText", length = 250, nullable = false)
    private String messageText;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCar", nullable = false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idClient", nullable = false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;

    public Message() {
    }

    public Message(Integer idMessage, String messageText) {
        this.idMessage = idMessage;
        this.messageText = messageText;
    }

    public Message(Integer idMessage, String messageText, Car car, Client client) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.car = car;
        this.client = client;
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
}
