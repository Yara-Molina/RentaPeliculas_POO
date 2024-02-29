package com.yaravazquez.rentapeliculas.models;

public class Pelicula {
    protected String title;
    protected String director;
    protected String gender;
    protected int year;
    protected int precio;


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGender() {
        return gender;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                ", precio=" + precio +
                '}';
    }
}


