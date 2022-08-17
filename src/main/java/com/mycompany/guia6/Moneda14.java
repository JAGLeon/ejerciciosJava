package com.mycompany.guia6;

import java.util.Scanner;

public class Moneda14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese sus Euros");
        float euros = leer.nextFloat();
        
        System.out.println("Ingrese a que moneda lo quiere convertir");
        System.out.println("YENES");
        System.out.println("DOLARES");
        System.out.println("LIBRAS");
        String opcion = leer.next();
       
        do {            
            switch (opcion.toUpperCase()) {
            case "YENES":
                        Yenes(euros);
                break;
            case "DOLARES":
                        Dolares(euros);
                break;
            case "LIBRAS":
                        Libras(euros);
                break;    
            default:
                System.out.println("Aun no manejamos esa moneda");
            }
            
        } while (!opcion.toUpperCase().equals("YENES") && !opcion.toUpperCase().equals("DOLARES") && !opcion.toUpperCase().equals("LIBRAS"));
                

    }
    
    public static void Yenes(float euros) {
        System.out.println("Cantidad a convertir: " + euros + " pasado a Yenes: " + (euros*129.852));
    }
    
    public static void Dolares(float euros) {
        System.out.println("Cantidad a convertir: " + euros + " pasado a Dolares: " + (euros*1.28611));
    }

    public static void Libras(float euros) {
        System.out.println("Cantidad a convertir: " + euros + " pasado a Libras: " + (euros*0.86));
    }        
}
