package parcialito1;

public abstract class Personaje {
    private String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double poderDestruccion();

    @Override
    public String toString() {
        return getNombre() + "-" + poderDestruccion();
    }
}
