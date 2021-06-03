package ejercicio7;

import ejercicio7.comparadorCandidato.ComparadorAnd;
import ejercicio7.comparadorCandidato.ComparadorAgrupacion;
import ejercicio7.comparadorCandidato.ComparadorNombre;
import ejercicio7.comparadorCandidato.ComparadorPartido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    private ArrayList<Candidato> candidatos;

    public Sistema() {
        candidatos = new ArrayList<>();
    }

    public void addCandidato(Candidato candidato){
        if(!candidatos.contains(candidato))
            candidatos.add(candidato);
    }

    public ArrayList<Candidato> ordenar(Comparator<Candidato> comparador){
        ArrayList<Candidato> copia = new ArrayList<>(candidatos);
        Collections.sort(copia, comparador);
        return copia;
    }

    public static void main(String[] args) {
        Sistema sistemaElectoral = new Sistema();
        Candidato candidato1 = new Candidato("candidato 1", "partido 1", "agrupacion 1");
        Candidato candidato2 = new Candidato("andidato2", "partido 1", "agrupacion 1");
        Candidato cantidato3 = new Candidato("Cantidato 3", "artido1", "agrupacion 3");
        sistemaElectoral.addCandidato(candidato1);
        sistemaElectoral.addCandidato(candidato2);
        sistemaElectoral.addCandidato(cantidato3);
        ComparadorAnd compPartAgrup = new ComparadorAnd(new ComparadorPartido(), new ComparadorAgrupacion());
        ComparadorAnd compFinal = new ComparadorAnd(compPartAgrup, new ComparadorNombre());
        System.out.println(sistemaElectoral.ordenar(compFinal));
    }
}