package org.juandavid.ejemplos.list;

import org.juandavid.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>(); //Se toman los repetidos con los valores
        //System.out.println(enlazada + ",size =" + enlazada.size());
        //System.out.println("Esta vacía = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Carlos",5));
        enlazada.add(new Alumno("Fernando",8));
        enlazada.add(new Alumno("Juan",9));
        enlazada.add(new Alumno("Lucia",10));
        enlazada.add(new Alumno("Esteban",3));
        enlazada.add( new Alumno("laura",2)); //lo agrega al index correspondiente y el siguiente queda por debajo
        enlazada.add(new Alumno("Pedro",3));

        System.out.println(enlazada + ",size = " + enlazada.size());

        enlazada.addFirst(new Alumno("felipe", 3));
        enlazada.addLast(new Alumno("sara",5));

        System.out.println(enlazada + ", size" + enlazada.getFirst());
        System.out.println("Ultimo =" + enlazada.getLast());
        System.out.println("Indice 3"+ enlazada.get(3));



        Alumno Carlos = enlazada.removeFirst();
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Juan",9));
        System.out.println(enlazada + "size = " + enlazada.size());

        Alumno a = new Alumno("sergio", 6);
        enlazada.addLast(a);
        System.out.println("indice de sergio = " + enlazada.indexOf(a));

        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("==================== previus =========");
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }

}
