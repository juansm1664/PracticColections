package org.juandavid.ejemplos.list;

import org.juandavid.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>(); //Se toman los repetidos con los valores
        System.out.println(al + ",size =" + al.size());
        System.out.println("Esta vacía = " + al.isEmpty());

        al.add(new Alumno("Carlos",5));
        al.add(new Alumno("Fernando",8));
        al.add(new Alumno("Juan",9));
        al.add(new Alumno("Lucia",10));
        al.add(new Alumno("Esteban",3));
        al.add(2, new Alumno("laura",2)); //lo agrega al index correspondiente y el siguiente queda por debajo
        al.add(new Alumno("Pedro",3));

        System.out.println(al + ",size =" + al.size());

        al.remove(new Alumno("Lucia",10)); //Para eliminar un elemento debe ser identico
        al.remove(2); //Elimina por el indice
        System.out.println(al + ", size =" + al.size());


        boolean b = al.contains(new Alumno("Esteban",3)); //para saber si lo contiene
        System.out.println("La lista contiene a Esteban = " + b);

        Object a[] = al.toArray(); //Retorna el contenido de la lista
        for(int i =0; i<a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }


    }

}
