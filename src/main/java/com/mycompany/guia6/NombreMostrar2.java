package com.mycompany.guia6;

import java.util.Scanner;

public class NombreMostrar2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Hello World! " + nombre);
    }
}
