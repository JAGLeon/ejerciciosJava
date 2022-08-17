package com.mycompany.guia6;

import java.util.Scanner;


public class Suma1 {

    public static void main(String[] args) {
        int valor1; int valor2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 valores para realizar la Suma");
       
        valor1 = leer.nextInt(); valor2 = leer.nextInt();
        Sumar(valor1,valor2);
    }
    
    public static void Sumar(int a, int b){
             System.out.println("La suma de sus 2 valores es: " + (a + b));
    }
}



