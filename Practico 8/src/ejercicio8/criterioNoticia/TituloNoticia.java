package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class TituloNoticia implements CriterioNoticia{
    private String titulo;

    public TituloNoticia(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().toLowerCase().contains(titulo.toLowerCase());
    }
}
