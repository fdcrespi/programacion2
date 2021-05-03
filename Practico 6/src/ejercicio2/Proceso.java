package ejercicio2;

public class Proceso implements Comparable<Proceso> {
    public int id;
    public double memoriaRequerida;

    public Proceso(int id, double memoriaRequerida) {
        this.id = id;
        this.memoriaRequerida = memoriaRequerida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(double memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }

    @Override
    public int compareTo(Proceso o) {
        return (int) getMemoriaRequerida() - (int) o.getMemoriaRequerida();
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "id=" + id +
                ", memoriaRequerida=" + memoriaRequerida +
                '}';
    }
}
