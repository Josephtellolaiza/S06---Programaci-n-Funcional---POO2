/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.OptionalDouble;


/*

7. Promedio de una Lista
Dada una lista de números:

List<Double> numeros = List.of(1.5, 2.0, 3.5, 4.0);
Objetivo: Calcular el promedio.

Operaciones: mapToDouble, average.


*/
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        List<Double> numeros = List.of(1.5, 2.0, 3.5, 4.0);
        
        OptionalDouble numerosPromedio = numeros.stream()
                .mapToDouble(numero-> numero) // no cambia nada, solo toma los valores mismos
                .average(); // calcula el promedio de los numeros de la lista
        
        
        System.out.println("El promedio de los numeros de la lista es: " + numerosPromedio.getAsDouble()); // muestra solo el valor, usamos getAsDouble para que nos de solo el valor
        
                
                
                
    }
    
}
