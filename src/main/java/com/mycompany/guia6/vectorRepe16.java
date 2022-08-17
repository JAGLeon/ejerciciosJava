package com.mycompany.guia6;

import java.util.Scanner;

public class vectorRepe16 {
    public static void main(String[] args) {
//        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//        numero y si se encuentra repetido
            
            Scanner leer = new Scanner(System.in);
            int[] vector = new int[100];
            
            for (int i = 0; i < 100; i++) {
                    vector[i] = (int) (Math.random() * 100);
            }
            
            System.out.println("Escribi un numero, te diremos siesta");
            for (int i = 0; i < 100; i++) {
                System.out.println("[ " + vector[i]+ " ]");
            }
            int numero = leer.nextInt();
            

            
            for (int i = 0; i < 100; i++) {
                    if (vector[i] == numero) {
                            System.out.print(i + " ");
                    }
            }
            
    }
}
