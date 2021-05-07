package ejercicio2;

import ejercicio2.comparador.ComparadorFrecuencia;

import java.util.Collections;

public class App {

    public static void main(String[] args) {
        String texto = "Un texto cualquiera, Bien escrito un";
        Vocabulario vocabulario = new Vocabulario(texto);
        System.out.println(vocabulario.palabrasOrdenadas());
        System.out.println(vocabulario.ordenFrecuencia());

    }
}
