package ejercicio1;

import java.time.LocalDate;

public class Alquiler {

    public Cliente cliente;
    public Item item;
    public LocalDate fechaDesde;
    public LocalDate fechaHasta;

    public Alquiler(Cliente cliente, Item item, LocalDate fechaDesde, LocalDate fechaHasta) {
        this.cliente = cliente;
        this.item = item;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", item=" + item +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                '}';
    }
}
