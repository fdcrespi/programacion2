package adicional;

public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, String apellido, int dni, String direccion, double descuento) {
        super(nombre, apellido, dni, direccion, descuento);
    }

    @Override
    public boolean leGustaLibro(Libro libro) {
        return super.leGustaLibro(libro) && contieneGenero(libro.getGenero());
    }
}
