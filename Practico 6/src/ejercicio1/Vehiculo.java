package ejercicio1;

public class Vehiculo implements Item {

    public String marca;
    public double kms;
    public String patente;
    public String tipo;
    public boolean alquilado;

    public Vehiculo(String marca, double kms, String patente, String tipo) {
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        this.tipo = tipo;
        alquilado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public boolean aptoAlquiler() {
        return !alquilado;
    }

    @Override
    public boolean alquilar() {
        if (aptoAlquiler()) {
            setAlquilado(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        Vehiculo vehiculo = (Vehiculo) o;
        return getPatente().equals(vehiculo.getPatente());
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", kms=" + kms +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
