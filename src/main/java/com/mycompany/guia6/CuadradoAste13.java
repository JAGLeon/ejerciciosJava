package com.mycompany.guia6;

import java.util.Scanner;

public class CuadradoAste13 {
        public static void main(String[] args) {

                    Scanner leer = new Scanner(System.in);
                    int asteriscos = leer.nextInt();
                    for (int i = 0; i < asteriscos; i++) {
                              System.out.print("*" );
                    }
                    System.out.println();
                    for (int i = 0; i < asteriscos-2; i++) {
                              System.out.print("*");
                              for (int j = 0; j < asteriscos-2; j++) {
                                        System.out.print(" ");
                              }                
                              System.out.print("*");
                              System.out.println();                              
                    }
                    for (int i = 0; i < asteriscos; i++) {
                              System.out.print("*");
                    }
        }
}
