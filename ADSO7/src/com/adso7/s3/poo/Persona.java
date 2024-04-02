package com.adso7.s3.poo;

public class Persona {
    
    public String nombre, apellido, docIdentifcacion;
    public int anioNacimiento;

    public Persona() {
        nombre = "";
        apellido = "";
        docIdentifcacion = "";
        anioNacimiento = 0;
    }

    public Persona(String nombre, String apellido, String docIdentifcacion, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.docIdentifcacion = docIdentifcacion;
        this.anioNacimiento = anioNacimiento;
    }
    
    
    
    public void imprimir_Persona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Identificación: "+docIdentifcacion);
        System.out.println("Año de nacimiento: "+anioNacimiento);
    }  
}
