package ejercicio14;

import ejercicio14.criterioPedido.CriterioMaterial;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica(new CriterioMaterial("madera"));

    }
}
