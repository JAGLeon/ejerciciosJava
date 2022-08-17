package com.mycompany.guia6;

import java.util.Scanner;

public class LargoPrograma {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
        String frase = leer.nextLine();
        
        if(frase.length() == 8){
            System.out.println("Se guardo en la nube");
        } else {
            System.out.println("Compre el pase premium para mas GB");
        }
       
    }
}
