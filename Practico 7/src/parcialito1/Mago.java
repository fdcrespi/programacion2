package parcialito1;

public class Mago extends Personaje{
    public int concentracion;

    public Mago(int concentracion) {
        super("Mago");
        this.concentracion = concentracion;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }

    @Override
    public double poderDestruccion() {
        return concentracion * 1000;
    }
}
