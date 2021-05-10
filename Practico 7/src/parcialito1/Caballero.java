package parcialito1;

public class Caballero extends Personaje{
    private double fuerza;
    private double potencia;

    public Caballero(double fuerza, double potencia) {
        super("caballero");
        this.fuerza = fuerza;
        this.potencia = potencia;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double poderDestruccion() {
        return fuerza*potencia;
    }
}
