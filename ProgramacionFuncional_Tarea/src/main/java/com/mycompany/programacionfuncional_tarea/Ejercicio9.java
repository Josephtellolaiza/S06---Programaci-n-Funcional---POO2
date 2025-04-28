/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.stream.Collectors;

/*

9. Eliminar Duplicados
Dada una lista con duplicados:

List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 4);
Objetivo: Obtener una lista sin elementos repetidos.

Operaciones: distinct, collect.

*/
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 4);
        
        List<Integer> numerosSinRepetir = nums.stream()
                .distinct()  // elimina los elementos que se repiten
                .collect(Collectors.toList()); // almacena los demas valores en una nueva lista
        
        System.out.println("La nueva lista con elementos sin repetir es: "+numerosSinRepetir); // muestra la nueva lista
        
        
    }
    
}
