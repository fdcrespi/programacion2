package ejercicio5;

import java.time.LocalDate;
import java.util.Objects;

public abstract class ElementoFS {
    private String nombre;
    private LocalDate creacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.creacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public abstract double getTamanio();

    @Override
    public boolean equals(Object o) {
        ElementoFS that = (ElementoFS) o;
        return getNombre().equals(that.getNombre());
    }
}
