package com.mycompany.guia6;

import java.util.Scanner;

public class ComienzaA9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase que comience con A!");
        String frase = leer.nextLine();
        
        System.out.println((frase.substring(0,1).toUpperCase().equals("A")) ? "Correcto" :  "Incorrecto");
    }
}
