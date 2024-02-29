package com.yaravazquez.rentapeliculas.models;

import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Pelicula> listaPeliculas;


    public Videoclub() {
        listaPeliculas = new ArrayList<>();
    }

    public void setNewPelicula(Pelicula newPelicula) {
        listaPeliculas.add(newPelicula);
    }

    public String mostrarPelicula() {
        String inventario = "";
        for (Pelicula iterador : listaPeliculas) {
            inventario = inventario + iterador.toString() + "\n";
        }
        return inventario;
    }
}
