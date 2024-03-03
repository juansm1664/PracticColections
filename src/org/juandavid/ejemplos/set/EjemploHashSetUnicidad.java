package org.juandavid.ejemplos.set;

import org.juandavid.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {

    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new ArrayList<>(); //Se ordena en la forma en que se van registrando, con sort si los ordena
        sa.add(new Alumno("Carlos",5));
        sa.add(new Alumno("Fernando",8));
        sa.add(new Alumno("Juan",9));
        sa.add(new Alumno("Lucia",10));
        sa.add(new Alumno("Esteban",3));
        sa.add(new Alumno("laura",2));
        sa.add(new Alumno("laura",2));
        sa.add(new Alumno("Esteban",3));
        sa.add(new Alumno("Esteban",8));
        System.out.println(sa);

        /*System.out.println(" =======Usando un for clásico======== ");
        for (int i= 0; i<sa.size() ; i++){
        Alumno a = sa.get(i); //COn set marca error porque no se permite los get -> Solo se puede con las listas
        System.out.println();*/

        System.out.println("=====Iterando usando foreach==========");
        for (Alumno a: sa){
            System.out.println(a);
        }

        System.out.println("============Iterando usando while y iterator===========");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("============Iterando usando Stream forEach===========");
        sa.forEach(System.out::println);
    }

}
