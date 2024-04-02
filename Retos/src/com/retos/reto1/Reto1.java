package com.retos.reto1;

import java.util.Scanner;

/**
 * Este reto de programación incluye estructuras condicionales, ciclos y
 * funciones
 *
 * @author El profe Julio - JAVA
 */
public class Reto1 {
    
    static Scanner input = new Scanner(System.in);

    /* Estructura condicional simple */
    public static void opc_1() {
        System.out.println("**********************************************************");
        System.out.println("************* ESTRUCTURA CONDICIONAL SIMPLE **************");
        System.out.println("**********************************************************");
        int cantB, cMin;
        System.out.print("Cantidad en bodega (unidades): ");
        cantB = Integer.parseInt(input.nextLine());
        System.out.print("Cantidad mínima requerida (unidades): ");
        cMin = Integer.parseInt(input.nextLine());
        if (cantB < cMin) {
            System.out.println("Entonces si es necesario realizar el pedido al proveedor");
        }

        if (cantB > cMin) {
            System.out.println("Entonces no es necesario realizar el pedido al proveedor");
        }

    }
    
    /* Estructura condicional doble */
    public static void opc_2(){
        System.out.println("**********************************************************");
        System.out.println("************* ESTRUCTURA CONDICIONAL DOBLE ***************");
        System.out.println("**********************************************************");
        int cantB, cMin;
        System.out.print("Cantidad en bodega (unidades): ");
        cantB = Integer.parseInt(input.nextLine());
        System.out.print("Cantidad mínima requerida (unidades): ");
        cMin = Integer.parseInt(input.nextLine());
        if (cantB < cMin) {
            System.out.println("Entonces si es necesario realizar el pedido al proveedor");
        }
        else{
            System.out.println("Entonces no es necesario realizar el pedido al proveedor");
        }
    }
    
    /* Estructura condicional múltiple */
    public static void opc_3(){
        System.out.println("**********************************************************");
        System.out.println("*********** ESTRUCTURA CONDICIONAL MULTIPLE **************");
        System.out.println("**********************************************************");
        int cantB, cMin, restante;
        System.out.print("Cantidad en bodega (unidades): ");
        cantB = Integer.parseInt(input.nextLine());
        System.out.print("Cantidad mínima requerida (unidades): ");
        cMin = Integer.parseInt(input.nextLine());
        restante = cantB - cMin;
        if(cantB > cMin){
            System.out.println("Entonces no es necesario realizar el pedido al proveedor");
            System.out.println("Unidades que hacen falta por vender: "+restante+".");
        }
        else if(restante < 10){
            System.out.println("Entonces no es necesario realizar el pedido al proveedor");
            System.out.println("Unidades que hacen falta vender: "+restante+". Alerta generada.");
        }
        else{
            System.out.println("Entonces si es necesario realizar el pedido al proveedor ");
        }
    }
    
    /* Estructura condicional anidado */
    public static void opc_4(){
        System.out.println("**********************************************************");
        System.out.println("*********** ESTRUCTURA CONDICIONAL ANIDADO ***************");
        System.out.println("**********************************************************");
        int cantB, cMin, unidades, vrUnitario, dineroCaja, valorCompra, restante;
        System.out.println("Ingrese la cantidad minima requerida: ");
        cMin = input.nextInt();
        
        System.out.println("Ingrese la cantidad actual en bodega: ");
        cantB = input.nextInt();

        if (cantB < cMin) {
            System.out.println("Realizar pedido a proveedor");
            
            System.out.println("Ingrese la cantidad de unidades de compra deseada: ");
            unidades = input.nextInt();
            
            System.out.println("Ingrese el valor de compra del producto: ");
            vrUnitario = input.nextInt();

            System.out.println("Ingrese el dinero en caja: ");
            dineroCaja = input.nextInt();        
            
            valorCompra = unidades * vrUnitario;

            if (valorCompra < dineroCaja) {
                System.out.println("Si es posible realizar el pedido");
            } 
            else {
                System.out.println("No es posible realizar el pedido");
            }
        } 
        else {
            restante = cantB - cMin;
            if (restante < 10) {
                System.out.println("NO es necesario realizar pedido a proveedor. " + 
                "Unidades que hacen falta vender: " + restante + ". "+
                "Alerta Generada");    
            } 
            else {
                System.out.println("NO es necesario realizar pedido a proveedor. " + 
                "Unidades que hacen falta vender: " + restante);    
            }
            
        }
    }
    
    /* Estructura condicional Dependiendo De / Según Sea */
    public static void opc_5(){
        System.out.println("**********************************************************");
        System.out.println("*********** ESTRUCTURA CONDICIONAL SWITCH ****************");
        System.out.println("**********************************************************");
        int diaSemana, totalsinDescuento;
        double descuento = 0, totalPago;
        System.out.print("Ingrese el día de la semana: ");
        diaSemana = Integer.parseInt(input.nextLine());
        System.out.print("Pago de la compra sin descuento, $");
        totalsinDescuento = Integer.parseInt(input.nextLine());
        switch (diaSemana) {
            case 1 -> {
                descuento = 0.05;
            }
            case 2 -> {
                descuento = 0.03;
            }
            case 3 -> {
                descuento = 0.1;
            }
            case 4 -> {
                descuento = 0.04;
            }
            case 5 -> {
                descuento = 0.06;
            }
            case 6 -> {
                descuento = 0.02;
            }
            case 7 -> {
                descuento = 0.01;
            }
        }
        totalPago = totalsinDescuento - (totalsinDescuento * descuento);
        System.out.println("Total a pagar, $"+totalPago);
    }
    
    /* Estructura ciclica */
    public static void opc_6(){
        System.out.println("**********************************************************");
        System.out.println("**************** ESTRUCTURA CICLICA - FOR ****************");
        System.out.println("**********************************************************");
        int cant, cantProducto, valorProducto, totalFactura = 0;
        System.out.print("Cantidad de tipos de productos: ");
        cant = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= cant; i++) {
            System.out.print("Ingrese la cantidad del producto " + i + ": ");
            cantProducto = Integer.parseInt(input.nextLine());
            System.out.print("Ingrese el valor del producto " + i + ": ");
            valorProducto = Integer.parseInt(input.nextLine());

            totalFactura = totalFactura + (cantProducto * valorProducto);
        }
        
        System.out.println("Total factura, $"+totalFactura);
    }
    
    /* Integración con estructuras condicionales y ciclicas */
    public static void opc_7(){
        System.out.println("**********************************************************************");
        System.out.println("**************** ESTRUCTURAS CONDICIONALES Y CICLICAS ****************");
        System.out.println("**********************************************************************");
        int cant, cantProducto, valorProducto, totalFactura = 0;
        boolean clientesXAtender = true;
        int cantidadClientes = 1;
        int totalVendido = 0;

        while (clientesXAtender) {
            System.out.println("Cliente " + cantidadClientes);
            System.out.print("Ingrese la cantidad de tipos de productos comprados: ");
            cant = Integer.parseInt(input.nextLine());

            for (int i = 1; i <= cant; i++) {
                System.out.print("Ingrese la cantidad del producto " + i + ": ");
                cantProducto = Integer.parseInt(input.nextLine());
                System.out.print("Ingrese el valor del producto " + i + ": ");
                valorProducto = Integer.parseInt(input.nextLine());

                totalFactura = totalFactura + (cantProducto * valorProducto);
            }

            System.out.println("Total factura, $"+totalFactura);

            System.out.print("¿Hay clientes por atender? (si o no) ");
            String nuevoCliente = input.nextLine();
            
            if (nuevoCliente.equals("no")) {
                clientesXAtender = false;
            }
            cantidadClientes++;
            totalVendido = totalVendido + totalFactura;
        }

        System.out.println("Total vendido, $"+totalVendido);
    }
    
        public static void main(String[] args) {

        int op;

        do {
            System.out.println("**********************************************************");
            System.out.println("***************** RETO DE PROGRAMACIÓN 1 *****************");
            System.out.println("**********************************************************");
            System.out.println();
            System.out.println("1. Estructura condicional simple");
            System.out.println("2. Estructura condicional doble");
            System.out.println("3. Estructura condicional múltiple");
            System.out.println("4. Estructura condicional anidado");
            System.out.println("5. Estructura Dependiendo De o Según");
            System.out.println("6. Estructura cíclica");
            System.out.println("7. Integración de las estructuras condicionales y cíclicas");
            System.out.println("8. Salir");
            System.out.print("Escoja la opción: ");
            op = Integer.parseInt(input.nextLine());
            switch (op) {
                case 1 -> {
                    opc_1();
                }
                case 2 -> {
                    opc_2();
                }
                case 3 -> {
                    opc_3();
                }
                
                case 4 -> {
                    opc_4();
                }
                
                case 5 -> {
                    opc_5();
                }
                
                case 6 -> {
                    opc_6();
                }
                
                case 7 -> {
                    opc_7();
                }
                case 8 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Error, intente de nuevo!");
                }
            }
        } while (op != 8);
    }

}
