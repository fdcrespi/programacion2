package ejercicio5;

import java.util.ArrayList;

public class Directorio extends ElementoFS{
    private ArrayList<ElementoFS> elementos;

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
    public double getTamanio() {
        double size = 0;
        for (ElementoFS e: elementos) {
            size += e.getTamanio();
        }
        return size;
    }
}
