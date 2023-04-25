package com.example.reciclerview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuarios;
    private static UsuarioRepository instance;

    public UsuarioRepository() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Manuel", "Navarro Pérez",
                R.mipmap.ic_actor_foreground));
        usuarios.add(new Usuario("Luis", "García Navarro",
                R.mipmap.ic_albanil_foreground));
        usuarios.add(new Usuario("Carlos", "Pérez Pérez",
                R.mipmap.ic_banquero_foreground));
        usuarios.add(new Usuario("Miguel", "Pérez Navarro",
                R.mipmap.ic_cocinero_foreground));
        usuarios.add(new Usuario("Tomás", "Pérez García",
                R.mipmap.ic_estudiante_foreground));
        usuarios.add(new Usuario("Pedro", "Navarro García",
                R.mipmap.ic_instagramer_foreground));
        usuarios.add(new Usuario("José", "Navarro Navarro",
                R.mipmap.ic_pintor_foreground));
        usuarios.add(new Usuario("Juan", "García García",
                R.mipmap.ic_policia_foreground));
        usuarios.add(new Usuario("Manuel", "García Pérez",
                R.mipmap.ic_politico_activo_foreground));
        usuarios.add(new Usuario("Raúl", "Navarro Pérez",
                R.mipmap.ic_politico_retirado_foreground));
        usuarios.add(new Usuario("Rubén", "García Navarro",
                R.mipmap.ic_vendedor_foreground));
        usuarios.add(new Usuario("Alejandro", "Pérez Pérez",
                R.mipmap.ic_youtuber_foreground));
    }

    public static UsuarioRepository getInstance() {
        if (instance == null) {
            instance = new UsuarioRepository();
        }
        return instance;
    }

    public Usuario get(int index) {
        return usuarios.get(index);
    }

    public int size() {
        return usuarios.size();
    }

    public void remove(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void add(int index, Usuario usuario) {
        usuarios.add(index, usuario);
    }

    public void sort(Comparator comparator) {
        Collections.sort(usuarios, comparator);
    }
}
