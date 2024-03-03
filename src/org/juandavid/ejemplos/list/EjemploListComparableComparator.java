package org.juandavid.ejemplos.list;

import org.juandavid.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {

    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>(); //Se toman los repetidos con los valores
        sa.add(new Alumno("Carlos",5));
        sa.add(new Alumno("Fernando",8));
        sa.add(new Alumno("Juan",9));
        sa.add(new Alumno("Lucia",10));
        sa.add(new Alumno("Esteban",3));
        sa.add(new Alumno("laura",2));
        sa.add(new Alumno("laura",2));
        sa.add(new Alumno("Esteban",3));
        sa.add(new Alumno("Esteban",8));

        //Collections.sort(sa); //Ordenado por la nota
        //sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        sa.sort(Comparator.comparing(Alumno::getNota)); //usando java 8
        System.out.println(sa);

        System.out.println("============Iterando usando Stream forEach===========");
        sa.forEach(System.out::println);
    }

}
