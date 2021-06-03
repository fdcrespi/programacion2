package ejercicio5;

import ejercicio5.criterio.Criterio;

import java.util.ArrayList;

public class Directorio extends ElementoFS{
    protected ArrayList<ElementoFS> elementos;

    public Directorio(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoFS elementoFS){
        if (!(elementos.contains(elementoFS))){
            elementos.add(elementoFS);
        }
    }

    @Override
    public ArrayList<ElementoFS> buscar(Criterio criterio) {
        ArrayList<ElementoFS> elem = new ArrayList<>();
        if(criterio.cumple(this)) elem.add(this);
        for (ElementoFS e: elementos) {
            elem.addAll(e.buscar(criterio));
        }
        return elem;
    }

    @Override
    public double getTamanio() {
        double size = 0;
        for (ElementoFS e: elementos) {
            size += e.getTamanio();
        }
        return size;
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "elementos=" + elementos +
                '}';
    }
}
