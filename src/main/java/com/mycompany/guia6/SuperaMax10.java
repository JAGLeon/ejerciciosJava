package com.mycompany.guia6;

import java.util.Scanner;

public class SuperaMax10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma; 
        int aux = 0;

        do {            
                    System.out.println("Ingrese valores");
                    suma = leer.nextInt();
                    aux += suma;
        } while (aux < 300);
        
        System.out.println("la suma de sus valores fue: "  + aux);
    }
}
