package ejercicio5;

import ejercicio5.criterio.Criterio;

import java.util.ArrayList;

public class Archivo extends ElementoFS{
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public ArrayList<ElementoFS> buscar(Criterio criterio) {
        ArrayList<ElementoFS> elem = new ArrayList<>();
        if(criterio.cumple(this))
            elem.add(this);
        return elem;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }
}
