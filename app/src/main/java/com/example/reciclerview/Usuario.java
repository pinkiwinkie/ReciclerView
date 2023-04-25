package com.example.reciclerview;

import java.io.Serializable;
import java.util.Comparator;

public class Usuario implements Serializable {
    private String nombre;
    private String apellidos;
    private int imgProfesion;
    public static final Comparator<Usuario> SORT_BY_NAME = new Comparator<Usuario>() {
        @Override
        public int compare(Usuario u1, Usuario u2) {
            if (u1.apellidos.compareToIgnoreCase(u2.getApellidos()) == 0)
                return u1.nombre.compareToIgnoreCase(u2.getNombre());
            return u1.apellidos.compareToIgnoreCase(u2.getApellidos());
        }
    };

    public static final Comparator<Usuario> SORT_BY_JOB = (u1, u2) -> {
        Profesion p1, p2;
        p1 = ProfesionRepository.getInstance().getProfessionByImage(u1.imgProfesion);
        p2 = ProfesionRepository.getInstance().getProfessionByImage(u2.imgProfesion);
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    };

    public Usuario(String nombre, String apellidos, int imgProfesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.imgProfesion = imgProfesion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getImgProfesion() {
        return imgProfesion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
