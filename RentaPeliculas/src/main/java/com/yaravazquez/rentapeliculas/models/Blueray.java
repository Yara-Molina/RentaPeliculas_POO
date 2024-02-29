package com.yaravazquez.rentapeliculas.models;


public class Blueray extends Pelicula{

    private String resolucion;
    private String capacidad;

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Blueray{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", precio=" + precio +
                "resolucion="+ capacidad+
                "capacidad"+resolucion+
                '}';
    }
}

