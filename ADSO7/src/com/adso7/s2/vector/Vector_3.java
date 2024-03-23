package com.adso7.s2.vector;

import java.util.Scanner;

/**
 * Crea un array de números y otro de String de N posiciones donde insertaremos
 * notas entre 0 y 10 (debemos controlar que inserte una nota valida), pudiendo
 * ser decimal la nota en el array de números, en el de Strings se insertaran
 * los nombres de los alumnos. Si la nota esta entre 0 y 5,99 , su calificación
 * es INSUFICIENTE Si esta entre 6 y 7,99 , su calificación es ACEPTABLE. Si
 * esta entre 8 y 8,99 su calificación es BUENA. Si esta entre 9 y 10 su
 * calificación es EXCELENTE. Muestra por pantalla, el alumno su nota y su
 * resultado en palabras. Realice las funciones que usted crea conveniente.
 *
 * @author SENA
 *
 */
public class Vector_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cración del array de calificaciones y nombre de los estudiantes");
        System.out.print("Dimensión del array: ");
        int n = Integer.parseInt(input.nextLine());
        double notas[] = new double[n];
        String nombres[] = new String[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(input.nextLine());
        }

        String resultado[] = new String[notas.length];
        for (int i = 0; i < notas.length; i++) {
            switch ((int) notas[i]) {
                case 0, 1, 2, 3, 4, 5 -> {
                    resultado[i] = "Insuficiente";
                }
                case 6, 7 -> {
                    resultado[i] = "Aceptable";
                }
                case 8 -> {
                    resultado[i] = "Bueno";
                }
                case 9, 10 -> {
                    resultado[i] = "Excelente";
                }
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El estudiante " + nombres[i] + ", tiene una nota de " + notas[i] + ", por lo que su calificación es " + resultado[i]);
        }
    }
}
