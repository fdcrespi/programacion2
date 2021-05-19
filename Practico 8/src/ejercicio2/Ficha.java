package ejercicio2;

public class Ficha {
    private int fortaleza;
    private int cantidadCasilleros;
    private int poderDestruccion;

    public Ficha(int fortaleza, int cantidadCasilleros, int poderDestruccion) {
        this.fortaleza = fortaleza;
        this.cantidadCasilleros = cantidadCasilleros;
        this.poderDestruccion = poderDestruccion;
    }

    public Ficha(int fortaleza, int cantidadCasilleros) {
        this.fortaleza = fortaleza;
        this.cantidadCasilleros = cantidadCasilleros;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    protected void setPoderDestruccin(int poder){
        poderDestruccion = poder;
    }

}
