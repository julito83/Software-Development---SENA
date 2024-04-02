package com.adso7.s3.poo;

public class OpMatematicas {

    /* Declaración de atributos */
    public int a, b;

    /* Métodos */
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        if(b == 0){
            return 0;
        }
        else{
            return (float) a / b;
        }
    }

}
