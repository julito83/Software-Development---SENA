package com.adso7.s2.vector;
import java.util.Scanner;

/**
 * Leer por teclado las notas de los alumnos de una clase y calcular la nota promedio del grupo. 
 * Mostrar los alumnos con notas superiores al promedio.
 * @author SENA
 */

public class Vector_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double suma = 0, prom;
        
        System.out.println("Dimensioón del array: ");
        int n = Integer.parseInt(input.nextLine());
        double notas[] = new double[n];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del alumno["+(i+1)+"]: ");
            notas[i] = Double.parseDouble(input.nextLine());
            suma += notas[i];
        }
        prom = suma / notas.length;
        System.out.println("El promedio del grupo es: "+(double)Math.round(prom*100)/100);
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println(" Listado de alumnos superiores al promedio del grupo ");
        System.out.println("*****************************************************");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > prom){
                System.out.println("Alumno No."+(i+1)+", nota final: "+notas[i]);
            }
        }
    }
}