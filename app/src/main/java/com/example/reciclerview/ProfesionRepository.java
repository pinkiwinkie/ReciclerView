package com.example.reciclerview;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProfesionRepository {
    private List<Profesion> profesiones;
    private static ProfesionRepository instance;

    public ProfesionRepository() {
        profesiones = new ArrayList<>();
        profesiones.add(new Profesion("Actor", R.mipmap.ic_actor_foreground));
        profesiones.add(new Profesion("Albañil", R.mipmap.ic_albanil_foreground));
        profesiones.add(new Profesion("Banquero", R.mipmap.ic_banquero_foreground));
        profesiones.add(new Profesion("Cocinero", R.mipmap.ic_cocinero_foreground));
        profesiones.add(new Profesion("Estudiante", R.mipmap.ic_estudiante_foreground));
        profesiones.add(new Profesion("Instagramer", R.mipmap.ic_instagramer_foreground));
        profesiones.add(new Profesion("Pintor", R.mipmap.ic_pintor_foreground));
        profesiones.add(new Profesion("Policía", R.mipmap.ic_policia_foreground));
        profesiones.add(new Profesion("Político activo", R.mipmap.ic_politico_activo_foreground));
        profesiones.add(new Profesion("Político retirado", R.mipmap.ic_politico_retirado_foreground));
        profesiones.add(new Profesion("Vendedor", R.mipmap.ic_vendedor_foreground));
        profesiones.add(new Profesion("Youtuber", R.mipmap.ic_youtuber_foreground));

    }

    public static ProfesionRepository getInstance() {
        if (instance == null)
            instance = new ProfesionRepository();
        return instance;
    }

    public List<Profesion> getAll() {
        return new ArrayList<>(profesiones);
    }

    public Profesion getProfessionByImage(int image) {
        Optional<Profesion> profesion = profesiones.stream()
                .filter(profesion1 -> profesion1.getImg() == image)
                .findFirst();
        //return profesion.orElse(null);
        if (profesion.isPresent())
            return profesion.get();
        return null;
    }

    public Profesion getProfessionByName(String nombre){
        Optional<Profesion> profesion = profesiones.stream()
                .filter(profesion1 -> profesion1.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        if (profesion.isPresent())
            return profesion.get();
        return null;
    }
}
