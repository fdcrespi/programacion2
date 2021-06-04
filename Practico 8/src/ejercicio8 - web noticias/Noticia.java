package ejercicio8;

import ejercicio8.criterioNoticia.CriterioNoticia;
import jdk.jfr.ContentType;

import java.util.ArrayList;

public class Noticia implements Contenido{
    private String titulo;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;
    private ArrayList<String> palabrasClaves;

    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        palabrasClaves = new ArrayList<>();
    }

    public void addPalabraClave(String palabra){
        if(!palabrasClaves.contains(palabra))
            palabrasClaves.add(palabra);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int cantidadNoticias() {
        return 1;
    }

    @Override
    public ArrayList<String> imprimirse() {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add(link);
        return palabras;
    }

    @Override
    public String toString() {
        return "Titulo:" + titulo;
    }

    @Override
    public ArrayList<Noticia> noticiasCumplen(CriterioNoticia criterio) {
        ArrayList<Noticia> noticiasOk = new ArrayList<>();
        if (criterio.cumple(this))
            noticiasOk.add(this);
        return noticiasOk;
    }

    @Override
    public Contenido copia(CriterioNoticia criterioPalabra) {
        if (criterioPalabra.cumple(this)) {
            Noticia nueva = new Noticia(titulo, introduccion, texto, autor, link);
            for (String p : palabrasClaves) {
                nueva.addPalabraClave(p);
            }
            return nueva;
        }
        return null;
    }

    public boolean contianePalabraClave(String palabra) {
        return palabrasClaves.contains(palabra);
    }
}
