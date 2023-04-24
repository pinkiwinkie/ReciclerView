package com.example.reciclerview;

public class Profesion {
    private int img;
    private String nombre;

    public Profesion(int img, String nombre) {
        this.img = img;
        this.nombre = nombre;
    }

    public int getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
