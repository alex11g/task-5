package com.mindhub.homebanking;

public class Client {
    private String name;
    private String correo;
    private String apellido;
    private int id;

    public Client() {
    }

    public Client(String name, String correo, String apellido) {
        this.name = name;
        this.correo = correo;
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
