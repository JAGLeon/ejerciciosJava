package com.mycompany.guia6;

import java.util.Scanner;

public class DobleTripleRaiz5 {

    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
          doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor que quiere evaluar");
        int numero = leer.nextInt();
        double raiz =  Math.sqrt(numero);
        
        System.out.println("El numero: " + numero + " el doble es: " + (numero * 2) + " el triple es: " + (numero * 3) + " la raiz: " + raiz);
    }
}
