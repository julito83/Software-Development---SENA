package com.adso7.s1;

import java.util.Scanner;

/**
 * @author El profe Juio - JAVA
 * 22 - 03 - 2024
 * Taller de repaso sobre estructuras básicas de programación
 * y el manejo de funciones.
*/

public class appTaller {

    static Scanner input = new Scanner(System.in);

    /* Indíce de Masa Corporal */
    public static void IMC() {
        double peso, estatura, imc;
        System.out.print("Peso (Kg): ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Estatura (mts, p.ej; 1.75): ");
        estatura = Double.parseDouble(input.nextLine());
        imc = peso / (Math.pow(estatura, 2));
        if (imc < 16) {
            System.out.println("Delgadez extrema");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Delgadez moderada");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Delgadez leve");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad leve");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obsesidad moderada");
        } else {
            System.out.println("Obsedidad mórbida");
        }
    }

    /* Programa de Matemáticas */
    public static void Matematicas() {
        int opc;
        do {
            System.out.println("PROGRAMA DE MATEMÁTICAS");
            System.out.println("1. Potencia de un número");
            System.out.println("2. Raíz de un número");
            System.out.println("3. Teorema de Pitágoras");
            System.out.println("4. Ecuación de primer grado");
            System.out.println("Escoja la opción");
            opc = Integer.parseInt(input.nextLine());
            switch (opc) {
                case 1 -> {
                    System.out.println("POTENCIA DE UN NÚMERO");
                    int base, exp, potencia;
                    System.out.print("Base: ");
                    base = Integer.parseInt(input.nextLine());
                    System.out.print("Exponente: ");
                    exp = Integer.parseInt(input.nextLine());
                    potencia = (int) Math.pow(base, exp);
                    System.out.println("La potencia de un número es: " + potencia);
                }
                case 2 -> {
                    System.out.println("RAÍZ DE UN NÚMERO");
                    int radicando, radical, raiz;
                    System.out.print("Readicando: ");
                    radicando = Integer.parseInt(input.nextLine());
                    System.out.print("Radical: ");
                    radical = Integer.parseInt(input.nextLine());
                    raiz = (int) Math.pow(radicando, 1 / radical);
                    System.out.println("La raíz de un número es: " + raiz);
                }
                case 3 -> {
                    System.out.println("TEOREMA DE PITAGORAS");
                    double cat1, cat2, hip;
                    System.out.println("Cateto 1: ");
                    cat1 = Double.parseDouble(input.nextLine());
                    System.out.println("Cateto 2: ");
                    cat2 = Double.parseDouble(input.nextLine());
                    hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
                    System.out.println("La hipotenusa es: " + hip);
                }
                case 4 -> {
                    System.out.println("ECUACIÓN DE PRIMER GRADO");
                    double a, b, x;
                    System.out.print("A: ");
                    a = Double.parseDouble(input.nextLine());
                    System.out.print("B: ");
                    b = Double.parseDouble(input.nextLine());
                    if (a == 0) {
                        System.out.println("Valor indeterminado");
                    } else {
                        x = -b / a;
                        System.out.println("El valor de la ecuación es: " + x);
                    }
                }
            }
        } while (opc != 5);
    }
    
    /* Pocentaje en un grupo de estudiantes*/
    public static void porcentaje(){
        System.out.println("PORCENTAJE DE UN GRUPO");
        double nh, nm, total, ph, pm;
        System.out.println("Hombres: ");
        nh = Double.parseDouble(input.nextLine());
        System.out.println("Mujeres: ");
        nm = Double.parseDouble(input.nextLine());
        total = nh + nm;
        ph = nh / total;
        pm = nm / total;
        System.out.println("El porcentaje de hombres es: "+(double)Math.round(ph*100)/100);
        System.out.println("El porcentaje de mujeres es: "+(double)Math.round(pm*100)/100);
    }
    
    /* Calculo de la masa de un neumatico */
    public static void masa_neumatico(){
        System.out.println("CALCULO DE LA MASA DE UN NEUMATICO");
        double masa, presion, volumen, temperatura;
        System.out.print("Presión: ");
        presion = Double.parseDouble(input.nextLine());
        System.out.print("Volumen: ");
        volumen = Double.parseDouble(input.nextLine());
        System.out.print("Temperatura: ");
        temperatura = Double.parseDouble(input.nextLine());
        masa = (presion * volumen) / (0.37 * (temperatura + 460));
        System.out.println("La masa del neumatico es: "+masa);
    }
    
    /* Calificación de empleados */
    public static void empleados(){
        double puntuacion;
        String nivel = "";
        
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int op;

        do {
            System.out.println("TALLER");
            System.out.println("1. Índice de Masa Corporal");
            System.out.println("2. Programa de Matemáticas");
            System.out.println("3. Porcentaje de un grupo");
            System.out.println("4. Calcular la masa de un neumático");
            System.out.println("5. Calificación de empleados");
            System.out.println("6. Sala de juegos");
            System.out.println("7. Área y semiperímetro de un triángulo");
            System.out.println("8. Programa de Estadística");
            System.out.println("9. Salir");
            System.out.print("Elija la opción: ");
            op = Integer.parseInt(input.nextLine());

            switch (op) {
                case 1 -> {
                    IMC();
                }

                case 2 -> {
                    Matematicas();
                }
                
                case 3 -> {
                    porcentaje();
                }
                
                case 4 -> {
                    
                }
                
                case 5 -> {
                    
                }
                
                case 6 -> {
                    
                }
                
                case 7 -> {
                    
                }
                
                case 8 -> {
                    
                }

                case 9 -> {
                    System.out.println("FIN");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Error, intente de nuevo!");
                }
            }
        } while (op != 9);
    }

}
