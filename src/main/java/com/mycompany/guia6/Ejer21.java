package com.mycompany.guia6;


import java.util.Scanner;

public class Ejer21 {
    public static void main(String[] args) {
        int[][] arrayM = new int[10][10];
        int[][] arrayP = new int[3][3];
        fill(arrayM);
        fill(arrayP);
        matchArrays(arrayM, arrayP);
    }

    public static void fill(int[][] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Ingrese valor en la posicion [" + i + "][" + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void matchArrays(int[][] arrayM, int[][] arrayP) {
        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM[0].length; j++) {
                if (arrayM[i][j] == arrayP[0][0]) {
                    iterateSubArray(arrayM, arrayP, i, j);
                }
            }
        }
    }

    public static void iterateSubArray(int[][] arrayM, int[][] arrayP, int i, int j) {
        int r, c, longI, longJ;
        r = c = 0;
        longI = arrayP.length + i;
        longJ = arrayP[0].length + j;

        for (int x = i; x < longI; x++) {
            for (int z = j; z < longJ; z++) {
                if (arrayM[x][z] == arrayP[r][c]) {
                    if (r == arrayP.length - 1 && c == arrayP[0].length - 1) {
                        System.out.println("El primer elemento se encuentra en el indice " + i + "," + j);
                    }
                    c++;
                    if (c == arrayP[0].length) {
                        r++;
                        c = 0;
                    }
                } else {
                    x = longI;
                    z = longJ;
                }
            }
        }
    }
}
