package ejercicio6;

import java.util.ArrayList;

public class Nodo{
    private Nodo hijoIzq;
    private Nodo hijoDer;
    private Nodo padre;
    Comparable valor;

    public Nodo(Comparable valor) {
        this.valor = valor;
        hijoDer = null;
        hijoDer = null;
        padre = null;
    }

    //no hacer set padre porque rompe estructura
    public Nodo(Comparable valor, Nodo padre){
        this(valor);
        this.padre = padre;
    }


    public void add(Comparable valor) {
        if(valor.compareTo(this.valor) > 0){
            if (hijoDer == null)
                hijoDer = new Nodo(valor, this);
            else hijoDer.add(valor);
        }
        else {
            if (hijoIzq == null)
                hijoIzq = new Nodo(valor, this);
            else hijoIzq.add(valor);
        }
    }

    public boolean contains(Comparable valor){
        if(this.valor.compareTo(valor) == 0) {
            return true;
        }
        else if (valor.compareTo(this.valor) > 0 && hijoDer != null) {
            return hijoDer.contains(valor);
        }
        else if (valor.compareTo(this.valor) < 0 && hijoIzq != null){
            return hijoIzq.contains(valor);
        }
        return  false;
    }

    public ArrayList<Comparable> recorrido(){
        ArrayList<Comparable> elementosEnOrden = new ArrayList<Comparable>();
        if (hijoIzq != null){
           elementosEnOrden.addAll(hijoIzq.recorrido());
        }
        elementosEnOrden.add(this.valor);
        if (hijoDer != null){
            elementosEnOrden.addAll(hijoDer.recorrido());
        }
        return elementosEnOrden;
    }

    @Override
    public String toString() {
        return this.valor + "\n" + " --> " + this.hijoIzq + " - " + this.hijoDer + "\n";
    }
}
