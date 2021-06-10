package App;

import App.criterio.CriterioElemento;

import java.util.ArrayList;

public class Paquete extends ElementoLibreria{
    private ArrayList<ElementoLibreria> elementos;

    public Paquete(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoLibreria elemento){
        if(!elementos.contains(elemento)){
            elementos.add(elemento);
        }
    }

    @Override
    public String getMarca() {
        if(elementos.isEmpty()) return null;
        return elementos.get(0).getMarca();
    }

    @Override
    public double getVolumen() {
        double volumenMayor = 0;
        for (ElementoLibreria e: elementos) {
            double volumenActual = e.getVolumen();
            if(volumenActual > volumenMayor){
                volumenMayor = volumenActual;
            }
        }
        return volumenMayor;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (ElementoLibreria e: elementos) {
            precio = precio + e.getPrecio();
        }
        return precio;
    }

    @Override
    public int getCantidadProductos() {
        int cantidad = 0;
        for (ElementoLibreria e: elementos) {
            cantidad += e.getCantidadProductos();
        }
        return cantidad;
    }

    @Override
    public ArrayList<ElementoLibreria> buscar(CriterioElemento criterio) {
        ArrayList<ElementoLibreria> elementosCumplen = new ArrayList<>();
        if(criterio.cumple(this)){
            elementosCumplen.add(this);
        }
        for (ElementoLibreria e: elementos) {
            elementosCumplen.addAll(e.buscar(criterio));
        }
        return elementosCumplen;
    }

    /*@Override
    public boolean equals(Object o) {
        try {
            Paquete paquete = (Paquete) o;
            return getNombre().equals(paquete.getNombre().toLowerCase()) && getMarca().equals(paquete.getMarca().toLowerCase());
        }catch (Exception e){
            return false;
        }
    }*/

}
