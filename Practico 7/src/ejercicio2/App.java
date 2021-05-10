package ejercicio2;

import ejercicio2.comparador.ComparadorFrecuencia;

import java.util.Collections;

public class App {

    public static void main(String[] args) {
        String texto = "Un texto cualquiera, Bien escrito un un";
        Vocabulario vocabulario = new Vocabulario(texto);
        System.out.println(vocabulario.cantidadPalabras());
      //  System.out.println(vocabulario.palabrasMasFrecuentes());
        System.out.println(vocabulario.cantidadVeces("un"));
        System.out.println(vocabulario.palabrasOrdenadas());
        System.out.println(vocabulario.ordenFrecuencia());

    }
}
