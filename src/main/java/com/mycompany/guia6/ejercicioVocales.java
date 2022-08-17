package com.mycompany.guia6;

import java.util.Scanner;

public class ejercicioVocales {
    
          public static void main(String[] args){
                    Scanner leer = new Scanner(System.in);
                    String cambio = "";
                    
                    System.out.println("Ingrese una oracion terminada con un punto (.)");
                    String text = leer.nextLine();
                    
                    int longitudText = text.length();
                    //evaluar que el final sea un punto
                    if( text.endsWith(".") ){
                        
                              for (int i = 0; i < longitudText; i++) {
                                        String caracter = text.substring( i , i +1);
                                        switch(caracter){
                                                  case "a":
                                                                      cambio += "@";
                                                        break;
                                                  case "e":
                                                                      cambio += "#";
                                                        break;
                                                  case "i":
                                                                      cambio +=  "$";
                                                        break;
                                                  case "o":
                                                                      cambio += "%";
                                                        break;
                                                  case "u":
                                                                      cambio += "*";
                                                        break;
                                                  default:
                                                            cambio += caracter;
                                        }                 
                              }
                              System.out.println(cambio);
                    } else {
                        System.out.println("No terminaste la oracion con un punto (.)");
                    }
          }
}

