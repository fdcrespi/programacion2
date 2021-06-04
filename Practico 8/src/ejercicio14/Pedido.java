package ejercicio14;

import java.time.LocalDate;
import java.util.Objects;

public class Pedido {
    private String material;
    private String caracteristica;
    private LocalDate fechaEntrega;
    private String lugarEntrega;
    private LocalDate fechaPedido;

    public Pedido(String material, String caracteristica, LocalDate fechaEntrega, String lugarEntrega) {
        this.material = material;
        this.caracteristica = caracteristica;
        this.fechaEntrega = fechaEntrega;
        this.lugarEntrega = lugarEntrega;
        fechaPedido = LocalDate.now();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Pedido pedido = (Pedido) o;
            return getMaterial().equals(pedido.getMaterial())
                    && getCaracteristica().equals(pedido.getCaracteristica())
                    && getFechaPedido().equals(pedido.getFechaPedido());
        } catch (Exception e){
            return false;
        }
    }
}
