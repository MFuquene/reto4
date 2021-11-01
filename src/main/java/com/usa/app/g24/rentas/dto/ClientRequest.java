package com.usa.app.g24.rentas.dto;

public class ClientRequest {

    private Integer idClient;
    private String email;
    private String name;
    private String password;
    private Integer age;

    public ClientRequest() {
    }

    public ClientRequest(Integer idClient, String email, String name,
                         String password, Integer age) {
        this.idClient = idClient;
        this.email = email;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
