package com.usa.app.g24.rentas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.usa.app.g24.rentas.dto.CarRequest;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "Car")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCar", length = 11, nullable = false)
    private Integer idCar;

    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "brand", length = 45, nullable = false)
    private String brand;

    @Column(name = "year", length = 4, nullable = false)
    private  Integer year;

    @Column (name = "description", length = 250, nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idGama", nullable = false)
    @JsonIgnoreProperties("cars")
    private Gama gama;

    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"car", "reservations"})
    private List<Message> messages;

    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"car", "messages"})
    private List<Reservation> reservations;

    public Car() {
    }

    public Car(Integer idCar, String name, String brand, Integer year,
               String description, Gama gama, CarRequest.Message message,
               CarRequest.Reservation reservation) {
        this.idCar = idCar;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
    }

    public Car(Integer idCar, String name, String brand, Integer year,
               String description, Gama gama) {
        this.idCar = idCar;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.gama = gama;
        this.messages = messages;
        this.reservations = reservations;
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

    public Gama getGama() { return gama; }

    public void setGama(Gama gama) {this.gama = gama;}

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
