package ejercicio6;

public class Nodo extends NodoRaiz{

    private Nodo padre;

    public Nodo(int valor) {
        super(valor);
        padre = null;
    }

    public void setPadre(Nodo padre){
        this.padre = padre;
    }

    @Override
    public void insertarHijo(Nodo pos, Nodo hijo) {
        super.insertarHijo(pos, hijo);
        setPadre(this);
    }
}
