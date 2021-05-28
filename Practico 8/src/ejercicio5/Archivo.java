package ejercicio5;

public class Archivo extends ElementoFS{
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }
}
