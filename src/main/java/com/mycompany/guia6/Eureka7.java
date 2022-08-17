package com.mycompany.guia6;

import java.util.Scanner;

public class Eureka7 {

    public static void main(String[] args) {
        Scanner leer = new  Scanner(System.in);
        System.out.println("Ingrese la clave");
        String clave = leer.nextLine();
        String claveBack = "EUREKA";
        
        if(clave.toUpperCase().equals(claveBack)){
            System.out.println("Ingresaste al lado oscuro");
        } else {
            System.out.println("Eres un simple mortal... Adios");
        }
    }
}
