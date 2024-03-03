package org.juandavid.ejemplos.set;

import org.juandavid.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed()); //

        sa.add(new Alumno("Carlos",5));
        sa.add(new Alumno("Fernando",8));
        sa.add(new Alumno("Juan",9));
        sa.add(new Alumno("Lucia",10));
        sa.add(new Alumno("Esteban",3));
        sa.add(new Alumno("laura",2));


        System.out.println(sa);
    }

}
