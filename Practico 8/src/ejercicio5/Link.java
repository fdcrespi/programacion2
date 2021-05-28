package ejercicio5;

public class Link extends ElementoFS{
    private ElementoFS link;
    private static final double TAMANIO = 1;

    public Link(String nombre, ElementoFS link) {
        super(nombre);
        this.link = link;
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }
}
