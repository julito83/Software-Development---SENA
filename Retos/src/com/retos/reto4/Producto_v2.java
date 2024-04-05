package com.retos.reto4;

public class Producto_v2 {
    
    /* Definición de atributos */
    int codigo, cantB, cMin;
    float pCompra;
    
    /* Método constructor */

    public Producto_v2() {
    }

    public Producto_v2(int codigo, int cantB, int cMin, float pCompra) {
        this.codigo = codigo;
        this.cantB = cantB;
        this.cMin = cMin;
        this.pCompra = pCompra;
    }
    
    /* Método para solicitar pedido al proveedor*/
    public boolean solicitarPedido(){
        return cantB < cMin;
    }

    /* Métodos GET - SET de la clase Producto */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantB() {
        return cantB;
    }

    public void setCantB(int cantB) {
        this.cantB = cantB;
    }

    public int getcMin() {
        return cMin;
    }

    public void setcMin(int cMin) {
        this.cMin = cMin;
    }

    public float getpCompra() {
        return pCompra;
    }

    public void setpCompra(float pCompra) {
        this.pCompra = pCompra;
    }
    
}
