package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

import java.util.Locale;

public class IntroduccionNoticiaContiene implements CriterioNoticia{
    private String introduccion;

    public IntroduccionNoticiaContiene(String introduccion) {
        this.introduccion = introduccion;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getIntroduccion().toLowerCase().contains(introduccion.toLowerCase());
    }
}
