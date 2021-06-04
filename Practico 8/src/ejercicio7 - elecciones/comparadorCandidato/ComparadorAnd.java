package ejercicio7.comparadorCandidato;

import ejercicio7.Candidato;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<Candidato> {
    Comparator<Candidato> comp1;
    Comparator<Candidato> comp2;

    public ComparadorAnd(Comparator<Candidato> comp1, Comparator<Candidato> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Candidato o1, Candidato o2) {
        if(comp1.compare(o1,o2) == 0){
            return comp2.compare(o1,o2);
        }
        return comp1.compare(o1,o2);
    }
}
