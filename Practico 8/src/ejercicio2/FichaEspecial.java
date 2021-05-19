package ejercicio2;

public class FichaEspecial extends Ficha{

    public FichaEspecial(int fortaleza, int cantidadCasilleros) {
        super(fortaleza, cantidadCasilleros);
        setPoderDestruccin(fortaleza/cantidadCasilleros);
    }


}
