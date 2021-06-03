package ejercicio3;

import ejercicio3.comparador.*;
import ejercicio3.criterio.Criterio;
import ejercicio3.criterio.CriterioAlquilerCancha;
import ejercicio3.criterio.CriterioCuotaMayorA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private ArrayList<Socio> socios;

    public Club() {
        socios = new ArrayList<>();
    }

    public void addSocio(Socio s){
        if (!socios.contains(s)) socios.add(s);
    }

    public ArrayList<Socio> buscar(Criterio criterio, Comparator<Socio> comparador){
        ArrayList<Socio> sociosCumplen = new ArrayList<>();
        for (Socio s: socios) {
            if(criterio.cumple(s)){
                sociosCumplen.add(s);
            }
        }
        Collections.sort(sociosCumplen, comparador);
        return sociosCumplen;
    }

    public ArrayList<Socio> reverse(Criterio crit, Comparator<Socio> comp){
        ArrayList<Socio> reverso = new ArrayList<>(buscar(crit,comp));
        Collections.reverse(reverso);
        return reverso;
    }

    public static void main(String[] args) {
        Club BocaJrs = new Club();
        Socio socio1 = new Socio("Martin", "Palermo", 32);
        Socio socio2 = new Socio("Juan Roman", "Riquelme", 30);
        Socio socio3 = new Socio("Carlos", "Tevez", 17);
        Socio socio4 = new Socio("Carlos", "Almendra", 16);
        Socio socio5 = new Socio("Alberto", "Pepe", 28);
        Alquiler alq1 = new Alquiler(LocalDate.now(), 1, 501);
        Alquiler alq2 = new Alquiler(LocalDate.now(), 2, 800);
        Alquiler alq3 = new Alquiler(LocalDate.now(), 3, 600);
        Alquiler alq4 = new Alquiler(LocalDate.now(), 3, 800);
        Alquiler alq5 = new Alquiler(LocalDate.now(), 3, 850);
        Alquiler alq6 = new Alquiler(LocalDate.now(), 3, 800);
        socio1.addAlquiler(alq1);
        socio1.addAlquiler(alq6);
        socio1.addAlquiler(alq2);
        socio2.addAlquiler(alq3);
        socio3.addAlquiler(alq4);
        socio3.addAlquiler(alq5);
        socio5.addAlquiler(alq6);
        BocaJrs.addSocio(socio1);
        BocaJrs.addSocio(socio2);
        BocaJrs.addSocio(socio3);
        BocaJrs.addSocio(socio4);
        BocaJrs.addSocio(socio5);

        /*CriterioCuotaImpaga c1 = new CriterioCuotaImpaga();*/
        ComparadorNombre compNombre = new ComparadorNombre();
        ComparadorApellido compApellido = new ComparadorApellido();
        ComparadorAnd compNombApe = new ComparadorAnd(compNombre, compApellido);
        /*System.out.println(BocaJrs.buscar(c1, compNombApe));*/

        /*CriterioMayorEdad c2 = new CriterioMayorEdad();
        ComparadorEdad compEdad = new ComparadorEdad();
        System.out.println(BocaJrs.buscar(c2, compEdad));*/

        /*CriterioAlquilerCancha c3 = new CriterioAlquilerCancha(3);
        ComparadorTotalAlquileresCancha compCancha = new ComparadorTotalAlquileresCancha(3);
        System.out.println(BocaJrs.reverse(c3, compCancha));*/

        socio2.setAldia(false);
        socio3.setAldia(false);
        socio5.setAldia(false);
        CriterioCuotaMayorA c4 = new CriterioCuotaMayorA(500); //Criterio para quedarme con los mas de 500
        /*ComparadorMoroso cm = new ComparadorMoroso(); //Ordenar por si es moroso o no
        ComparadorAnd cuotaImp = new ComparadorAnd(cm, compNombApe); //Ordeno los que tienen la cuota paga por nombre
        ComparadorNot ci = new ComparadorNot(cm); //Ordenar si la cuota es
        ComparadorAnd cuotaPaga = new ComparadorAnd(ci, compNombApe); // Ordeno los que tienen la cuota impaga por nombre
        ComparadorAnd cuotas = new ComparadorAnd(cuotaPaga, cuotaImp); //Ordeno por cuota paga e impaga*/
        ComparadorAnd cuotas = new ComparadorAnd(new ComparadorMoroso(), new ComparadorNombre());
        System.out.println(BocaJrs.buscar(c4, cuotas));

    }
}
