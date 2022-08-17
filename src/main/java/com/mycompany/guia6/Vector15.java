package com.mycompany.guia6;


public class Vector15 {
    public static void main(String[] args) {
                int[]  vector= new int [100];
                
                for (int i = 0; i < 100; i++) {
                        vector[i] = i;
                }
                
                for (int i = 99; i > -1; i--) {
                    System.out.print("[ " + vector[i] + " ]");
                }
    }
}