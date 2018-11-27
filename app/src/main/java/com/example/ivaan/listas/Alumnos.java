package com.example.ivaan.listas;

public class Alumnos {

    private String nombre;
    private String mail;
    private String foto;

    public Alumnos(String nombre, String mail, String foto){
        this.nombre=nombre;
        this.mail=mail;
        this.foto=foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
