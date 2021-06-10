package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class NoticiaConPalabraClave implements CriterioNoticia{
    private String palabra;

    public NoticiaConPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contianePalabraClave(palabra);
    }
}
