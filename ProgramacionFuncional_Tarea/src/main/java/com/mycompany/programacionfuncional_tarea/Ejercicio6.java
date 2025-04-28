/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.Optional;

/*

6. Palabras con Longitud Específica
Dada una lista de palabras:

List<String> palabras = List.of("sol", "luna", "estrella", "mar");
Objetivo: Encontrar la primera palabra que tenga exactamente 4 letras.

Operaciones: filter, findFirst.


*/
public class Ejercicio6 {
    
    
    public static void main(String[] args) {
        
        List<String> palabras = List.of("sol", "luna", "estrella", "mar");
        
            Optional<String> palabra4Letras = palabras.stream()
                .filter(palabra -> palabra.length() == 4) // filtra las palabras con 4 letras
                .findFirst();  // nos da el primer elemento, en este caso de solo los que pasaron el filtrado de 4 letras
        
        
        System.out.println("La palabra con 4 letras en la lista es: " + palabra4Letras.get()); // nos da solo el valor luna, y no Optional[luna]
           
        
            
        
        
        
    }
    
}
