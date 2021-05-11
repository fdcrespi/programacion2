package ejercicio6;

import org.w3c.dom.Node;

public class NodoRaiz {
    private int valor;
    private Nodo hijoDer;
    private Nodo hijoIzq;

    public NodoRaiz (int valor){
        this.valor = valor;
        hijoDer = null;
        hijoIzq = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void insertar(Nodo hijo){
        if (hijo.getValor() < getValor()){
            insertarHijo(hijoIzq, hijo);
        } else {
            insertarHijo(hijoDer, hijo);
        }
    }

    public void insertarHijo(Nodo pos, Nodo hijo){
        if(pos==null) {
            pos = hijo;
        } else pos.insertar(hijo);
    }
}
