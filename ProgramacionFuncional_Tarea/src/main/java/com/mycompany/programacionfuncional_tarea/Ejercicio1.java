/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionfuncional_tarea;

import java.util.List;

/*

1. Filtrar y Contar
Dada una lista de números:

List<Integer> numeros = List.of(3, 7, 12, 5, 20, 8);
Objetivo: Contar cuántos números son mayores que 10.

Operaciones: filter, count.

*/

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = List.of(3, 7, 12, 5, 20, 8);
        
        long cantidad = listaNumeros.stream() // la variable que alamacenara los filtros que haremos
                .filter(numero ->numero > 10) // filtra los que son mayores que 10
                .count(); // cuenta los valores que superaron el filtro
                
        
        System.out.println("Los numeros mayores a 10 son: "+ cantidad); // muestra los valores que superaron el filtro
    }
    
}
