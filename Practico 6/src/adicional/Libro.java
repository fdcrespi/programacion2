package adicional;

public class Libro extends Producto{
    private String resumen;
    private String genero;

    public Libro(String nombre, String autor, double precio, String resumen, String genero) {
        super(nombre, autor, precio);
        this.resumen = resumen;
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
