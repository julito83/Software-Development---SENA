package com.adso7.s3.poo;
import java.util.Scanner;
public class appPlano2D {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("Punto X: ");
        a = Double.parseDouble(input.nextLine());
        System.out.print("Punto Y: ");
        b = Double.parseDouble(input.nextLine());
        Plano2D p = new Plano2D(a, b);
        System.out.println("La distancia es: "+p.distanciaOrigen());
        System.out.println("El cuadrante es: "+ p.cuadrante());
        
    }
    
}
