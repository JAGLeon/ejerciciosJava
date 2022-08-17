package com.mycompany.guia6;

import java.util.Scanner;

public class MenuOperaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        boolean salir = true;
        do {            
            System.out.println("Ingrese 2 valores para realizar una operacion");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Seleccione una opcion");
            int numMenu = leer.nextInt();

            
            switch (numMenu) {
                case 1:
                            System.out.println("La suma de sus valores es: " + (num1 + num2));;
                    break;
                case 2:
                            System.out.println("La resta de sus valores es: " + (num1 - num2));;
                    break;
                case 3:
                            System.out.println("La multiplicacion de sus valores es: " + (num1 * num2));;
                    break;
                case 4:
                            System.out.println("La division de sus valores es: " + (num1 / num2));;
                    break;
                case 5:
                            System.out.println("Desea salir del programa? S = si/N = no");

                            String opcion = leer.next();

                            if(opcion.toLowerCase().equals("s")){
                                salir = false;                                
                            } else {
                                System.out.println("Le mostraremos las opciones");
                            }
                    break;
                default:
                        System.out.println("Aun no tenemos esas opciones en el sistema");
                         break;
            }
            
        } while (salir == true);
    }
}
