package com.mycompany.guia6;

import java.util.Scanner;

public class SecuenciasXO12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int acumC = 0; int acumI = 0;
        
        do {    
        System.out.println("Ingrese una frase de 5 caracteres");        
        frase = leer.next().toLowerCase();
         if(frase.length() == 5){
                if(frase.startsWith("x") && frase.endsWith("o")){
                    acumC += 1;
                } else {
                    if(!frase.equals("&&&&&")){
                            acumI += 1;               
                    }
                }
        } else {
            acumI += 1;               
        }
        } while (!frase.equals("&&&&&"));
        
        System.out.println("La cantidad de frases correctas es: " + acumC + ". La cantidad de frases incorrectas es: " + acumI);
    }
}
