package ejercicio5;

import ejercicio5.criterio.Criterio;

import java.util.ArrayList;

public class Link extends ElementoFS{
    private ElementoFS link;
    private static final double TAMANIO = 1;

    public Link(String nombre, ElementoFS link) {
        super(nombre);
        this.link = link;
    }

    @Override
    public ArrayList<ElementoFS> buscar(Criterio criterio) {
        ArrayList<ElementoFS> elem = new ArrayList<>();
        if(criterio.cumple(link))
            elem.add(this);
        return elem;
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }
}
