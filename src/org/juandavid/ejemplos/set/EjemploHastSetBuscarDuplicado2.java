package org.juandavid.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHastSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Atún", "Pejerrey", "Lenguado", "Robalo", "Lenguado"};

        Set<String> unicos = new HashSet<>(); //Son mas rápidos
        Set<String> duplicados = new HashSet<>();

        for(String pez: peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println("Unicos "+ unicos);
        System.out.println("Duplicados" + duplicados);

    }
}
