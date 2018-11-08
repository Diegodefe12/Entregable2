package com.example.defel.entregable_android;

import java.util.ArrayList;
import java.util.List;

public class RecetasProvider {

    public static List<Receta> cargarRecetas() {
        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta(R.drawable.tiramisu, "Tiramisu", "lalala", "lalala"));
        recetas.add(new Receta(R.drawable.chocotorta, "Chocotorta", "lalala", "lalala"));
        recetas.add(new Receta(R.drawable.flan, "Flan", "lalala", "lalala"));


        return recetas;
    }
}
