/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.stream.Collectors;

/*

Ejercicio Integrador:
Problema:
Dada una lista de personas:

record Persona(String nombre, int edad) {}
List<Persona> personas = List.of(
    new Persona("Ana", 25),
    new Persona("Luis", 17),
    new Persona("Marta", 30)
);
Objetivos:

Filtrar los mayores de 18 años.

Extraer solo sus nombres.

Ordenarlos alfabéticamente.

Solución esperada: ["Ana", "Marta"].

*/


public class EjercicioIntegrador {
    
    public static void main(String[] args) {
        
        record Persona(String nombre, int edad) {}
        List<Persona> personas = List.of(new Persona("Ana", 25), new Persona("Luis", 17), new Persona("Marta", 30) );
        
        List<String> personasSolucion = personas.stream()
                .filter( persona -> persona.edad > 18) // filtra las personas de la lista mayores de 18
                .map(persona->persona.nombre) // de las personas que pasaron el filtro hacemos que nos de solo sus nombres
                .sorted() // ordena los nombres alfabeticamente
                .collect(Collectors.toList()); // crea una lista con esos valores, ya en orden alfabetico
        
        System.out.println("Los nombres de las persona mayores a 18 son: "+personasSolucion); // muestra la lista
    }
    
}
