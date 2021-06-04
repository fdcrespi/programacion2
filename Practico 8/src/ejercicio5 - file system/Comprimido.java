package ejercicio5;

import ejercicio5.criterio.Criterio;

import java.util.ArrayList;

public class Comprimido extends Directorio{
    private double factor;

    public Comprimido(String nombre, ElementoFS comprimido, double factor) {
        super(nombre);
        if (!(factor > 0))
            this.factor = 0;
        else
            this.factor = factor;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()/factor;
    }

    @Override
    public ArrayList<ElementoFS> buscar(Criterio criterio) {
        ArrayList<ElementoFS> elementosCumplen = new ArrayList<>();
        if (criterio.cumple(this)) {
            elementosCumplen.add(this);
            return elementosCumplen;
        }
        for (ElementoFS e: elementos) {
            if(!e.buscar(criterio).isEmpty()){
                elementosCumplen.add(this);
                return elementosCumplen;
            }
        }
        return elementosCumplen;
    }
}
