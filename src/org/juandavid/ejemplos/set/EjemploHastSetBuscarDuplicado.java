package org.juandavid.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHastSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Atún", "Pejerrey", "Lenguado", "Robalo", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento Duplicado = "+ pez);
            }
        }
        System.out.println(unicos.size() + "Elementos NO duplicados = "+ unicos);

    }
}
