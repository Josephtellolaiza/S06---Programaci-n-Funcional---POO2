/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;
import java.util.stream.Collectors;


/*

4. Concatenar Strings
Dada una lista de palabras:

List<String> palabras = List.of("Hola", "mundo", "funcional");
Objetivo: Unir todas las palabras en un solo String separado por espacios.

Operaciones: collect(Collectors.joining(" ")).


*/

public class Ejercicio4 {
    
    
    public static void main(String[] args) {
        
        List<String> palabras = List.of("Hola", "mundo", "funcional");
        
        String palabrasUnidas = palabras.stream()
                .collect(Collectors.joining(" "));
        
        
        System.out.println("Las palabras de la lista ahora se unieron y son: " + palabrasUnidas);
        
    }
}
