package com.retos.reto2;

import java.util.Scanner;

/**
 * Este reto de programación incluye estructuras condicionales, ciclos y
 * estructuras de datos: vectores
 *
 * @author El profe Julio - JAVA
 */
public class Reto2 {

    public static void imprimirMatriz(int matriz[][]) {
        for (int[] is : matriz) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float promedio;

        System.out.print("Introduzca el numero de productos: ");
        int productos = Integer.parseInt(input.nextLine());
        int[] listaCodigo = new int[productos];

        System.out.print("Introduzca el número de sedes: ");
        int sedes = Integer.parseInt(input.nextLine());
        int[][] listacantB = new int[sedes][productos];
        int[][] listacMin = new int[sedes][productos];

        System.out.println("Ingrese los códigos de productos: ");
        for (int i = 0; i < productos; i++) {
            listaCodigo[i] = input.nextInt();
        }

        System.out.println("Ingrese tabla de la cantidad en bodega: ");
        for (int i = 0; i < sedes; i++) {
            for (int j = 0; j < productos; j++) {
                listacantB[i][j] = input.nextInt();
            }
        }
        imprimirMatriz(listacantB);
        System.out.println();

        System.out.println("Ingrese tabla de la cantidad mínima requerida: ");
        for (int i = 0; i < sedes; i++) {
            for (int j = 0; j < productos; j++) {
                listacMin[i][j] = input.nextInt();
            }
        }
        imprimirMatriz(listacMin);
        System.out.println();

        for (int i = 0; i < sedes; i++) {
            for (int j = 0; j < productos; j++) {
                if (listacantB[i][j] < listacMin[i][j]) {
                    System.out.println("Se debe solicitar producto " + listaCodigo[j] + " en sede " + i);
                }
            }
        }

        for (int i = 0; i < productos; i++) {
            int suma = 0;
            for (int j = 0; j < sedes; j++) {
                suma += listacantB[j][i];
            }
            promedio = (float) suma / sedes;
            System.out.println("El promedio de productos del código " + listaCodigo[i] + " es: " + promedio);
        }

    }

}
