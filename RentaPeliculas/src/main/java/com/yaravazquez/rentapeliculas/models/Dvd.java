package com.yaravazquez.rentapeliculas.models;

import java.util.Arrays;

public class Dvd extends Pelicula {
    String idiomaAudio;
    String idiomasSubtitulos;


    public String getIdiomaAudio() {
        return idiomaAudio;
    }

    public void setIdiomaAudio(String idiomaAudio) {
        this.idiomaAudio = idiomaAudio;
    }

    public String getIdiomasSubtitulos() {
        return idiomasSubtitulos;
    }

    public void setIdiomasSubtitulos(String idiomasSubtitulos) {
        this.idiomasSubtitulos = idiomasSubtitulos;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "idiomaAudio="+ idiomaAudio+
                "idiomasSubtitulos=" + idiomasSubtitulos +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", precio=" + precio +
                '}';
    }

}



