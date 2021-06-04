package ejercicio8;

import ejercicio8.criterioNoticia.CriterioNoticia;

import java.util.ArrayList;

public interface Contenido {
    int cantidadNoticias();
    ArrayList<String> imprimirse();
    ArrayList<Noticia> noticiasCumplen(CriterioNoticia criterio);
    Contenido copia(CriterioNoticia criterioPalabra);
}
