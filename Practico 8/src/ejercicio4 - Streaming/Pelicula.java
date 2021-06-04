package ejercicio4;

import ejercicio4.criterio.Criterio;

import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anio;
    private LocalTime duracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String director, int anio, LocalTime duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
        generos = new ArrayList<>();
        actores = new ArrayList<>();
        edadMinima = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void addGenero(String genero){
        if(!generos.contains(genero.toLowerCase()))
            generos.add(genero.toLowerCase());
    }

    public void addActor(String actor){
        if(!actores.contains(actor.toLowerCase()))
            actores.add(actor.toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        Pelicula pelicula = (Pelicula) o;
        return getAnio() == pelicula.getAnio() && getTitulo().equals(pelicula.getTitulo());
    }

    @Override
    public String toString() {
        return "Titulo:" + getTitulo() + " Sinopsis:" + getSinopsis() + "\n";
    }

    public boolean contieneGenero(String genero) {
        return generos.contains(genero.toLowerCase());
    }

    public boolean contieneActor(String actor) {
        return actores.contains(actor.toLowerCase());
    }

    public boolean esRentable(Criterio criterio){
        return criterio.cumple(this);
    }
}
