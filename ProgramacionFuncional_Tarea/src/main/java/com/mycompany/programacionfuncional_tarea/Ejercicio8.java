/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*

8. Agrupar por Longitud
Dada una lista de palabras:

List<String> palabras = List.of("casa", "perro", "sol", "gato");
Objetivo: Agrupar las palabras por su longitud (ej: {3=["sol"], 4=["casa", "gato"], 5=["perro"]}).

Operaciones: collect(Collectors.groupingBy(String::length)).


*/
public class Ejercicio8 {
    
    
    public static void main(String[] args) {
        
        List<String> palabras = List.of("casa", "perro", "sol", "gato");
        
        Map<Integer, List<String>> palabrasAgrupadas = palabras.stream()
                .collect(Collectors.groupingBy(String::length)); // nos da la clave y valores de cada clave, por lo que debe ser un map quien lo almacene
        
        System.out.println("Los elementos agrupados por su tamanio queda asi: "+palabrasAgrupadas); // muestra las claves y los valores
        // las claves son el tamaño de letras que compone cada uno de sus valores
        
        
    }
    
}
