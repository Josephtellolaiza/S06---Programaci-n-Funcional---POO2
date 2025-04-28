/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.stream.Collectors;

/*

5. Números Pares al Cuadrado
Dada una lista:

List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
Objetivo: Obtener una lista con los cuadrados de los números pares.

Operaciones: filter, map, collect.

*/
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
    
        List<Integer> numerosParesCuadrados = numeros.stream()
            .filter(numero -> numero %2 == 0) // filtra los numeros pares
            .map(numero-> numero * numero) // multiplica cada valor a su cuadrado, solo a los valores que pasaron el filtro anterior
            .collect(Collectors.toList()); // crea una nueva lista con esos valores que fueron multiplicados anteriormente
    
        System.out.println("La lista de los numeros pares con sus cuadrados es: " + numerosParesCuadrados); // los muestra
        
    }
    
    
    
}
