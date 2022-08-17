package com.mycompany.guia6;

public class ExtABCD2 {
 
    public static void main(String[] args) {
          
        
        int A, B,C,D,aux;

        A=1;
        B=2;
        C=3;
        D=4;
        aux=0;
        
        System.out.println("{" + A + "}" + "{" + B + "}" + "{" + C + "}" +"{" + D + "}");
        
        aux = B; // Guardo B
        B = C; // MUESTRO C -> B
        C = A; // MUESTRO A -> C
        A = D; // MUESTRO D -> A
        D = aux; // MUESTRO B
        
        System.out.print("{" + A + "}" + "{" + B + "}" + "{" + C + "}" +"{" + D + "} MODIF");

    }
    
}
