package com.adso7.s3.poo;

public class Plano2D {
    
    private double x, y;
    
    /* Método constructor: Establecer el origen del plano cartesiano */
    public Plano2D(){
        x = 0.0;
        y = 0.0; 
    }

    /* Método constructor parametrizado por el usuario */
    public Plano2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distanciaOrigen(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    
    public String cuadrante(){
        if(x > 0 && y > 0){
            return "Primer cuadrante";
        }
        if(x < 0 && y > 0){
            return "Segundo cuadrante";
        }
        if(x < 0 && y < 0){
            return "Tercer cuadrante";
        }
        if(x > 0 && y < 0){
            return "Cuarto cuadrante";
        }
        return "";
    }
    
}
