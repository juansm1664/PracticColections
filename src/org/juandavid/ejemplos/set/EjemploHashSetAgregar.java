package org.juandavid.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        System.out.println("====Usando set==");
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        boolean st = hs.add("tres");
        System.out.println("permite elementos duplicado= " + st);
        System.out.println(hs);

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);

        System.out.println("======usando List=====");
        List<String> ls = new ArrayList<>();
        ls.add("uno");
        ls.add("dos");
        ls.add("tres");
        ls.add("cuatro");
        ls.add("cinco");
        System.out.println(ls);

        Collections.sort(ls);

        boolean b = ls.add("tres");
        System.out.println("permite elementos duplicado= " + b);
        System.out.println(hs);

    }

    }


