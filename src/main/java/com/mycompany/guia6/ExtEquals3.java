package com.mycompany.guia6;

import java.util.Scanner;

public class ExtEquals3 {
    
        public static void main(String[] args) {
        
            Scanner leer =  new Scanner(System.in);
            System.out.println("Ingrese una vocal");
            String vocal = leer.nextLine();
            
            
            if (vocal.toLowerCase().equals("a") || vocal.toLowerCase().equals("e") || vocal.toLowerCase().equals("i") 
                    || vocal.toLowerCase().equals("o") || vocal.toLowerCase().equals("u")  ) {
                System.out.println("Genial es una vocal");
            } else {
                System.out.println("No es vocal, que pena");
            }
            
        }
    
}
