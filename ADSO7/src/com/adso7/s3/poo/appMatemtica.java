package com.adso7.s3.poo;
import java.util.Scanner;

public class appMatemtica {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero_1, numero_2;
        
        System.out.print("A: ");
        numero_1 = Integer.parseInt(input.nextLine());
        System.out.print("B: ");
        numero_2 = Integer.parseInt(input.nextLine());
        OpMatematicas opc = new OpMatematicas();
        System.out.println("La suma es: "+opc.sumar(numero_1, numero_2));
        System.out.println("La resta es: "+opc.restar(numero_1, numero_2));
        System.out.println("La multiplicación es: "+opc.multiplicar(numero_1, numero_2));
        try {
            if(numero_2 == 0){
                System.out.println("No se puede dividir por cero");
            }
            else{
                System.out.println("La división es: "+opc.dividir(numero_1, numero_2));
            }
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
        }
    }
    
}
