package com.mycompany.guia6;

import java.util.Scanner;

public class MinusculaMayuscula3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase <3");
        String frase = leer.nextLine();
        
        System.out.println("Frase minuscula: " + frase.toLowerCase());
        System.out.println("Frase mayuscula: " + frase.toUpperCase());
    }
}
