/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*

10. Máximo y Mínimo
Dada una lista:

List<Integer> numeros = List.of(10, 3, 8, 15, 2);
Objetivo: Encontrar el número máximo y mínimo usando Stream.

Operaciones: max, min (con Comparator.naturalOrder()).

*/
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = List.of(10, 3, 8, 15, 2);
        
        Optional<Integer> numeroMaximo = numeros.stream()
                .max(Comparator.naturalOrder()); // max trabaja con Optional, compara los valores y nos da el mayor
        
        System.out.println("El valor maximo es: "+numeroMaximo.get()); // con el get hacemos que nos de solo el valor
        
        Optional<Integer> numeroMinimo = numeros.stream()
                .min(Comparator.naturalOrder()); // min trabaja con Optional, compara los valores y nos da el menor
        
        System.out.println("El valor minimo es: "+numeroMinimo.get()); // con el get hacemos que nos de solo el valor
        
    }
    
}
