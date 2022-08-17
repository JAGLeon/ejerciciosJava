package com.mycompany.guia6;


import java.util.Scanner;

public class ejercicioFor {

           public static void main(String[] args) {
               
                    Scanner leer = new Scanner(System.in);
                    int dim;

                    System.out.println("Ingrese un valor entre '0 y 20' ");

                    dim = leer.nextInt();

                    System.out.print(dim + " ");
                    
                    for (int i = 0; i < dim; i++) {
                        System.out.print("*");
                    }
           }
}
