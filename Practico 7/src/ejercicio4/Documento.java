package ejercicio4;

import ejercicio2.Palabra;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Documento{
    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo.toLowerCase();
        this.contenido = contenido.toLowerCase();
        autores = new ArrayList<String>();
        palabrasClaves = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        Documento documento = (Documento) o;
        return getTitulo().equals(documento.getTitulo());
    }

    public void addPalabraClave(String palabra){
        if(!palabrasClaves.contains(palabra)) palabrasClaves.add(palabra.toLowerCase());
    }

    public boolean contienePalabraClave(String palabra){
        return palabrasClaves.contains(palabra.toLowerCase());
    }

    public boolean contieneAutor(String autor){
        return autores.contains(autor.toLowerCase());
    }

    public boolean contieneContenido(String palabra){
        return getContenido().contains(palabra.toLowerCase());
    }

    public int cantidadPalabrasContenido(){
        int i = 0;
        for (String t: contenido.split("\\s+|\n|, ")) {
            i++;
        }
        return i;
    }

    public boolean sinPalabrasClaves(){
        return palabrasClaves.isEmpty();
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'';
    }
}
