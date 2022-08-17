package com.mycompany.guia6;

import java.util.Scanner;

public class ExtAltura6 {
    
    public static void main(String[] args) {
        
        Scanner leer =  new Scanner(System.in);
        
        int personas = leer.nextInt();
        float[] vector = new float[personas];
        int cont = 0;
        double bajo = 0;              
        double alto = 0;


         for (int i = 0; i < personas; i++) {
            float altura = leer.nextFloat();
             vector[i] = altura;
         }
         
         for (int i = 0; i < personas; i++) {
             
                if (vector[i] < 1.60) {
                    bajo += vector[i];
                    cont ++;
                } 
                alto += vector[i];
      
          }
         
         System.out.println("El promedio de bajo es: " + (bajo / cont) + " El promedio general es de: " + (alto/personas));
        
            
            
        
    }
    
}
