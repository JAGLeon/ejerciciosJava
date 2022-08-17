package com.mycompany.guia6;

import java.util.Scanner;

public class ExtObraS5 {
    
        public static void main(String[] args) {
        
                    Scanner leer =  new Scanner(System.in);
                    
                    System.out.println("Ingrese su plan Social");
                    
                    String socio = leer.nextLine();
                    
                    switch (socio.toUpperCase()) {
                            case "A":
                                        System.out.println("El valor de su cuota mensual es de 1597.68 con un 50% off en tratamientos");
                                        System.out.println("El costo del tratamiento es de 122.997 con el descuento " + Math.round(122997*50/100) );
                                break;
                            case "B":
                                         System.out.println("El valor de su cuota mensual es de 997 con un 30% off en tratamientos");
                                         System.out.println("El costo del tratamiento es de 122.997 con el descuento " + Math.round(122997*70/100) );
                                break;
                            case "C":
                                         System.out.println("El valor de su cuota mensual es de 770 sin descuento en tratamientos");                                
                                         System.out.println("El costo del tratamiento es de 122.997");
                                break;
                            default:
                                System.out.println("¿Seguro que sos socio?");
                    }
            
            
        }
    
    
}
