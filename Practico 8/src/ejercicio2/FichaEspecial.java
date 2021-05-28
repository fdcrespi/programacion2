package ejercicio2;

public class FichaEspecial extends Ficha{

    public FichaEspecial(int fortaleza, int cantidadCasilleros) {
        super(fortaleza, cantidadCasilleros);
        if (cantidadCasilleros != 0) {
            setPoderDestruccion(fortaleza / cantidadCasilleros);
        } else setPoderDestruccion(1);
    }

}
