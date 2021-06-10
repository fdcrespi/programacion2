package App;

import App.criterio.CriterioElemento;
import App.criterio.CriterioMarca;
import App.criterio.CriterioPrecioMayor;

import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private ArrayList<ElementoLibreria> elementos;
    private CriterioElemento criterio;

    public Libreria(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addElemento(ElementoLibreria elemento){
        if(!elementos.contains(elemento)){
            elementos.add(elemento);
        }
    }

    public void setCriterio(CriterioElemento criterio) {
        this.criterio = criterio;
    }

    public boolean sePuedePublicitar(ElementoLibreria elemento){
        return criterio.cumple(elemento);
    }

    public ArrayList<ElementoLibreria> buscar(CriterioElemento criterio){
        ArrayList<ElementoLibreria> elementosCumplen = new ArrayList<>();
        for (ElementoLibreria e: elementos) {
            elementosCumplen.addAll(e.buscar(criterio));
        }
        return elementosCumplen;
    }

    public static void main(String[] args) {
        Libreria libreria = new Libreria("Libreria");
        Producto prod1 = new Producto("Lapicera", "bic", 10, 25);
        Producto prod2 = new Producto("Lapiz", "bic",15, 30);
        Paquete pack = new Paquete("Colegio");
        pack.addElemento(prod1);
        pack.addElemento(prod2);
        libreria.addElemento(pack);
        System.out.println(libreria.buscar(new CriterioPrecioMayor(0)));
    }
}
