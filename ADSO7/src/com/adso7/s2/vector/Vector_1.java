package com.adso7.s2.vector;
import java.util.Scanner;

/**
 * Leer N números enteros por teclado y guardarlos en un vector. Calcula y muestra el 
 * promedio de los números que estén en las posiciones pares del vector.
 * @author SENA
 */

public class Vector_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double suma = 0, prom;
        System.out.print("Dimensión del array: ");
        int n = Integer.parseInt(input.nextLine());
        int notas[] = new int[n];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota["+i+"]: ");
            notas[i] = Integer.parseInt(input.nextLine());
            if(notas[i] % 2 == 0){
                suma += notas[i];
            }
        }
        prom = suma / notas.length;
        System.out.println("El promedio del array en las posiciones pares es: "+prom);
    }
    
}
