package com.adso7.s2.matriz;
import java.util.Scanner;

/**
 * Crear dos matrices de n x n y sumar sus valores, los resultados se deben almacenar en otra matriz. 
 * Los valores y la longitud serán insertados por el usuario. Mostrar las matrices originales y el resultado.
 * @author El profe Julio - JAVA
 */
public class Matriz_1 {
    
    /* Función para imprimir la matriz */
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Creación de las matrices");
        System.out.print("Tamaño (filas y columnas): ");
        int n = Integer.parseInt(input.nextLine());
        int MatrizA [][] = new int[n][n];
        int MatrizB [][] = new int[n][n];
        int MatrizC [][] = new int[n][n];
        
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[0].length; j++) {
                System.out.print("Matriz A["+(i+1)+"]["+(j+1)+"]: ");
                MatrizA[i][j] = Integer.parseInt(input.nextLine());
                System.out.print("Matriz B["+(i+1)+"]["+(j+1)+"]: ");
                MatrizB[i][j] = Integer.parseInt(input.nextLine());
                
                MatrizC[i][j] = MatrizA[i][j] + MatrizB[i][j];
            }
        }
        
        System.out.println("Matriz A");
        mostrarMatriz(MatrizA);
        System.out.println("Matriz B");
        mostrarMatriz(MatrizB);
        System.out.println("Matriz C o Matriz Resultante");
        mostrarMatriz(MatrizC);
        
    }
    
}
