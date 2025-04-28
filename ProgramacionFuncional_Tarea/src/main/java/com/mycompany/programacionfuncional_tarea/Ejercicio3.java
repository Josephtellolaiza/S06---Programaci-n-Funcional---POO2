/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;

/*

3. Sumar Cuadrados
Dada una lista de enteros:

List<Integer> nums = List.of(1, 2, 3, 4);
Objetivo: Calcular la suma de los cuadrados de todos los números.

Operaciones: map, reduce (o sum).

*/
public class Ejercicio3 {
    
    
    public static void main(String[] args) {
        
        List<Integer> nums = List.of(1, 2, 3, 4);
        
        int sumaNumeros = nums.stream()
                .map(numero -> numero * numero) // vuelve cada numero a su cuadrado
                .reduce(0,(acumulador, numero) -> acumulador + numero); // suma los numeros comensando con un valor de 0
        
        System.out.println("La suma de los numeros de la lista es: "+sumaNumeros); // lo muestra
    }
    
}
