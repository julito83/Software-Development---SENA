package com.retos.reto3;
import javax.swing.JOptionPane;

public class appProducto_v1 {

    public static void main(String[] args) {

        int cod = 0, cantBodega = 0, cMinRequerida = 0;
        float precioCompra = 0;

        cod = Integer.parseInt(JOptionPane.showInputDialog("Código del producto"));
        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Precio de compra, $"));
        cantBodega = Integer.parseInt(JOptionPane.showInputDialog("Cantidad en bodega:"));
        cMinRequerida = Integer.parseInt(JOptionPane.showInputDialog("Cantidad mínima requerida en bodega:"));

        Producto_v1 p = new Producto_v1(cod, cantBodega, cMinRequerida, precioCompra);
        if (p.solicitarPedido()) {
            JOptionPane.showMessageDialog(null, "Alerta generada, se necesita unidades del producto");
        } else {
            JOptionPane.showMessageDialog(null, "En este momento no es necesario pedirle al proveedor");
        }
    }
}
