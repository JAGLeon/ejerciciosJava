package com.mycompany.guia6;

import java.util.Scanner;

public class ParImpar6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int numero = leer.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
