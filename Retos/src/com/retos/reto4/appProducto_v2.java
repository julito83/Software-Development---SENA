package com.retos.reto4;

import java.util.Scanner;

public class appProducto_v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Producto_v2 productos[] = new Producto_v2[10];
        int cod = 0, cantBodega = 0, cMinRequerida = 0;
        float precioCompra = 0;

        System.out.print("Cantidad de productos: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Código del producto " + (i + 1) + ": ");
            cod = Integer.parseInt(input.nextLine());
            System.out.print("Precio de compra, $");
            precioCompra = Float.parseFloat(input.nextLine());
            System.out.print("Cantidad en bodega: ");
            cantBodega = Integer.parseInt(input.nextLine());
            System.out.print("Cantidad mínima requerida en bodega: ");
            cMinRequerida = Integer.parseInt(input.nextLine());

            productos[i] = new Producto_v2(cod, cantBodega, cMinRequerida, precioCompra);
        }

        int menor = 1000000;
        Producto_v2 pMen = productos[0];
        for (int i = 0; i < n; i++) {
            if (productos[i].solicitarPedido()) {
                System.out.println("Alerta generada para el código " + productos[i].getCodigo());
            } else {
                System.out.println("En este momento no es necesario pedirle al proveedor");
            }
            if (productos[i].getCantB() < menor) {
                menor = productos[i].getCantB();
                pMen = productos[i];
            }
        }
        System.out.println("El código del producto con el menor número de unidades en bodega es = " + pMen.getCodigo());
    }
}
