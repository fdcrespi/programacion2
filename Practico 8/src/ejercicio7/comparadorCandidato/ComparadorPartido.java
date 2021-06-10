package ejercicio7.comparadorCandidato;

import ejercicio7.Candidato;

import java.util.Comparator;

public class ComparadorPartido implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getPartidoPolitico().compareTo(o2.getPartidoPolitico());
    }
}
