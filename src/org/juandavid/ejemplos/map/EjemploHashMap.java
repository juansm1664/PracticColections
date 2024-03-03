package org.juandavid.ejemplos.map;

import java.text.CollationElementIterator;
import java.text.SimpleDateFormat;
import java.util.*;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "jhon");
        persona.put("apellido", "Done");
        persona.put("edad", "30");
        persona.put("","juasm3007@gmail.com");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estad","California");
        direccion.put("ciudad","santa barbara");
        direccion.put("calle"," on street");
        direccion.put("numero","1234");

        persona.put( "direccion", direccion);

        System.out.println("Persona con hasMap = " + persona);

        String nombre = (String) persona.get("nombre");
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>)persona.get("direccion");

        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("El ciudad de " + ciudad + " es: " + ciudad);
        System.out.println("El barrio de " + barrio + " es: " + barrio);



        String valorEdad = (String) persona.remove("edad");
        System.out.println("Eliminado = " + valorEdad);
        System.out.println("Persona =" + persona);


        boolean b2 = persona.containsKey("edad");
        System.out.println("b2 "+ b2);

        Collection<Object> valores = persona.values();
        for(Object v: valores){
            System.out.println(v);
        }
        System.out.println("============================");

        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println("K "+ k);
        }
        System.out.println("============================");

        for(Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println(par.getKey()+ "=> " + par.getValue());
        }
        System.out.println("============================");
        for(String llave: persona.keySet()){
            Object valor = (Object) persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        System.out.println("==================usando java 8 y lambda========");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + "->" + valor);
        });

        System.out.println("total" + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());
        boolean b3 = persona.replace("nombre","jhon","Emy");
        System.out.println("usando el método replace en b3 = " + b3);
        System.out.println("persona =" + persona);
    }
}
