package com.mycompany.guia6;

import java.util.Scanner;

public class ExtRomano4 {
    
    public static void main(String[] args) {
        
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese el numero a convertir");
        int num = leer.nextInt();
        
        switch (num) {
            case 1:
                    System.out.println("El 1 en numero romano es" + " I ");
                break;
            case 2:
                    System.out.println("El 2 en numero romano es" + " II ");
                break;
            case 3:
                    System.out.println("El 3 en numero romano es" + " III ");
                break;
            case 4:
                    System.out.println("El 4 en numero romano es" + " IV ");
                break;
            case 5:
                    System.out.println("El 5 en numero romano es" + " V ");
                break;
            case 6:
                    System.out.println("El 6 en numero romano es" + " VI ");
                break;
            case 7:
                    System.out.println("El 7 en numero romano es" + " VII ");
                break;
            case 8:
                    System.out.println("El 8 en numero romano es" + " VIII ");
                break;
            case 9:
                    System.out.println("El 9 en numero romano es" + " IX ");
                break;
            case 10:
                    System.out.println("El 10 en numero romano es" + " X ");
                break;                
            default:
                   System.out.println("Aun ese numero no sabemos convertirlo");
        }
        
    }
    
    
}
