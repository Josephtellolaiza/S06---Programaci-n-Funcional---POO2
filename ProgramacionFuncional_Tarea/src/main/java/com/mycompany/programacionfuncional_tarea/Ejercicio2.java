/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.stream.Collectors;

/*
2. Convertir a Mayúsculas
Dada una lista de palabras:

List<String> palabras = List.of("java", "python", "c", "ruby");
Objetivo: Crear una nueva lista con todas las palabras en mayúsculas.

Operaciones: map, collect.

*/


public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        
        List<String> palabras = List.of("java", "python", "c", "ruby");
        
        List<String> palabrasMayusculas = palabras.stream()
                .map(palabra -> palabra.toUpperCase()) // cada elemento de la lista lo pasa a mayusculas con el .toUpperCase
                .collect(Collectors.toList()); // almacena los nuevos elementos en una nueva lista
                
        // palabrasMayusculas almacenara esa nueva lista
                
                
        System.out.println("Las palabras ahora en mayusculas: " + palabrasMayusculas); // mostrara la lista
        
        
    }
    
}
