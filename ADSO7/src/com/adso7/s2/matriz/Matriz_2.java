package com.adso7.s2.matriz;

import java.util.Scanner;

public class Matriz_2 {

    private Scanner input = new Scanner(System.in);
    private String departamentos[];
    private double[][] tempmensual;
    private double[] temptri;

    public void cargar() {
        departamentos = new String[4];
        tempmensual = new double[4][3];
        for (int i = 0; i < departamentos.length; i++) {
            System.out.print("Nombre del departamento " + (i + 1) + ": ");
            departamentos[i] = input.nextLine();
            for (int j = 0; j < tempmensual[i].length; j++) {
                System.out.print("Ingresar temperatura mensual " + (j + 1) + ": ");
                tempmensual[i][j] = Double.parseDouble(input.nextLine());
            }
        }
    }

    public void imprimirTempMensuales() {
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("Departamento: " + departamentos[i] + ": ");
            for (int j = 0; j < tempmensual[i].length; j++) {
                System.out.println(tempmensual[i][j] + " ");
            }
        }
    }

    public void calcularTempTrimestral() {
        temptri = new double[4];
        for (int i = 0; i < tempmensual.length; i++) {
            int suma = 0;
            for (int j = 0; j < tempmensual[i].length; j++) {
                suma += tempmensual[i][j];
            }
            temptri[i] = suma / 3;
        }
    }

    public void imprimirTempTrimestral() {
        System.out.println("Temperaturas trimestrales");
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println(departamentos[i] + " - " + temptri[i]);
        }
    }

    public void dptoMayorTempTrimestral() {
        int mayor = (int) temptri[0];
        String nombre = departamentos[0];
        for (int i = 0; i < departamentos.length; i++) {
            if (temptri[i] > mayor) {
                mayor = (int) temptri[i];
                nombre = departamentos[i];
            }
        }
        System.out.println("El departamento "+nombre+" con mayor temperatura es de: "+(double)mayor);
    }

    public static void main(String[] args) {

        Matriz_2 matrixtemp = new Matriz_2();
        matrixtemp.cargar();
        matrixtemp.imprimirTempMensuales();
        matrixtemp.calcularTempTrimestral();
        matrixtemp.imprimirTempTrimestral();
        matrixtemp.dptoMayorTempTrimestral();

    }

}
