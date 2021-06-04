package ejercicio6;

import java.util.ArrayList;

public class Buzon extends Lugar{
    private ArrayList<Integer> niniosBuenos;
    private ArrayList<Carta> cartas;

    public Buzon(String nombre) {
        super(nombre);
        niniosBuenos = new ArrayList<>();
        cartas = new ArrayList<>();
    }

    public void agregarNinioBueno(int dni){
        if(!niniosBuenos.contains(dni)){
            niniosBuenos.add(dni);
        }
    }

    public void agregarCarta(Carta carta){
        if (!ninioTieneCarta(carta)){
            if (!niniosBuenos.contains(carta.getDniRemitente())) {
                carta.modificarCarta();
            }
            cartas.add(carta);
        }
    }
    
    private boolean ninioTieneCarta(Carta carta){
        for (Carta c: cartas) {
            if (c.getRemitente() == carta.getRemitente())
                return true;
        }
        return false;
    }

    @Override
    public int cantidadCartasRegalo(String regalo) {
        int cantidad = 0;
        for (Carta c: cartas) {
            if (c.tieneRegalo(regalo))
                cantidad++;
        }
        return cantidad;
    }

    @Override
    public int cantidadCartas() {
        return cartas.size();
    }

    @Override
    public int cantidadNiniosMalos() {
        int cantidad = 0;
        for(Carta c: cartas){
            if (!niniosBuenos.contains(c.getDniRemitente())){
                cantidad++;
            }
        }
        return cantidad;
    }
}
