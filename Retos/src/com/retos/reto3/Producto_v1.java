package com.retos.reto3;

public class Producto_v1 {
    
    /* Definición de atributos */
    int codigo, cantB, cMin;
    float pCompra;
    
    /* Método constructor */

    public Producto_v1() {
    }

    public Producto_v1(int codigo, int cantB, int cMin, float pCompra) {
        this.codigo = codigo;
        this.cantB = cantB;
        this.cMin = cMin;
        this.pCompra = pCompra;
    }
    
    public boolean solicitarPedido(){
        return cantB < cMin;
    }
    
}