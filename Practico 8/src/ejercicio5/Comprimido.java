package ejercicio5;

public class Comprimido extends ElementoFS{
    private double factor;
    private ElementoFS comprimido;

    public Comprimido(String nombre, ElementoFS comprimido, double factor) {
        super(nombre);
        this.comprimido = comprimido;
        if (!(factor > 0))
            this.factor = 0;
        else
            this.factor = factor;
    }

    @Override
    public double getTamanio() {
        return comprimido.getTamanio()/factor;
    }
}
