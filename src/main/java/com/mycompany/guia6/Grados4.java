package com.mycompany.guia6;

import java.util.Scanner;

public class Grados4 {

    public static void main(String[] args) {
          /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
          Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los centigrados");
        int centigrados = leer.nextInt();
        float fahrenheit = 32+ (9 + centigrados / 5);
        
        System.out.println("Los grados correspondientes es: " + fahrenheit);
    }
}
